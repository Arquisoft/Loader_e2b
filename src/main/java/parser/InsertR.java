package parser;

import java.util.List;

import dbupdate.Insert;
import dbupdate.InsertP;
import model.User;
import persistence.UserFinder;

public class InsertR implements Insert {

	@Override
	public User save(User user){
		return new InsertP().save(user);
	}

	@Override
	public List<User> findByDNI(String dni) {
		return UserFinder.findByDNI(dni);
	}

	@Override
	public List<User> findByEmail(String email) {
		return UserFinder.findByEmail(email);
	}
}
