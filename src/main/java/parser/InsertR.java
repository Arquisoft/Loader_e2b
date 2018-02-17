package parser;

import java.util.List;

import dbupdate.Insert;
import dbupdate.InsertP;
import model.Usuario;
import persistence.UserFinder;

public class InsertR implements Insert {

	@Override
	public Usuario save(Usuario user){
		return new InsertP().save(user);
	}

	@Override
	public List<Usuario> findByDNI(String dni) {
		return UserFinder.findByDNI(dni);
	}

	@Override
	public List<Usuario> findByEmail(String email) {
		return UserFinder.findByEmail(email);
	}
}
