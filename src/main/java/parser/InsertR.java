package parser;

import java.util.List;

import dbupdate.Insert;
import dbupdate.InsertP;
import model.Ciudadano;
import model.Usuario;
import persistence.UserFinder;

public class InsertR implements Insert {

	@Override
	public User save(User user){
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
