package parser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.lowagie.text.DocumentException;

import dbupdate.Insert;
import dbupdate.InsertP;
import model.Ciudadano;
import model.Usuario;
import persistence.UserFinder;

public class InsertR implements Insert {

	@Override
	public Usuario save(Usuario user) throws FileNotFoundException, DocumentException, IOException {
		return new InsertP().save(user);
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
