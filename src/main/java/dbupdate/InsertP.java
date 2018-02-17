package dbupdate;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import model.User;
import parser.cartas.LetterGenerator;
import persistence.UserFinder;
import persistence.util.Jpa;
import reportwriter.ReportWriter;

public class InsertP implements Insert {

	@Override
	public User save(User user)  {
		EntityManager mapper = Jpa.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();
		try {
			if (!UserFinder.findByDNI(user.getCodigo()).isEmpty()) {
				ReportWriter.getInstance().getWriteReport().log(Level.WARNING,
						"El usuario con el dni " + user.getCodigo() + " ya existe en la base de datos");
				trx.rollback();
			} else if (!UserFinder.findByEmail(user.getEmail()).isEmpty()) {
				ReportWriter.getInstance().getWriteReport().log(Level.WARNING,
						"Ya existe un usuario con el email " + user.getEmail() + " en la base de datos");
				trx.rollback();
			} else {
				Jpa.getManager().persist(user);
				trx.commit();
				
				LetterGenerator.generateTxtLetter(user);
				LetterGenerator.generatePdfLetter(user);
				LetterGenerator.generateWordLetter(user);
				
			}
		} catch (PersistenceException ex) {
			ReportWriter.getInstance().getWriteReport().log(Level.WARNING, "Error de la BBDD");
			if (trx.isActive())
				trx.rollback();
		} finally {
			if (mapper.isOpen())
				mapper.close();
		}
		return user;
	}

	@Override
	public List<Ciudadano> findByDNI(String dni) {
		return UserFinder.findByDNI(dni);
	}

	@Override
	public List<Ciudadano> findByEmail(String email) {
		return UserFinder.findByEmail(email);
	}
}
