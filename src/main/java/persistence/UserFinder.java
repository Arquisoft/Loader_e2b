package persistence;

import java.util.List;
import model.Ciudadano;
import model.Usuario;
import persistence.util.Jpa;

public class UserFinder {

	public static List<Usuario> findByDNI(String dni) {
		return Jpa.getManager().createNamedQuery("User.findByDni", Usuario.class).
				setParameter(1, dni).getResultList();
	}

	public static List<Usuario> findByEmail(String email) {
		return Jpa.getManager().createNamedQuery("User.findByEmail", Usuario.class).
				setParameter(1, email).getResultList();
	}
}
