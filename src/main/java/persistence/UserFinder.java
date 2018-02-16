package persistence;

import java.util.List;
import model.Ciudadano;
import persistence.util.Jpa;

public class UserFinder {

	public static List<Ciudadano> findByDNI(String dni) {
		return Jpa.getManager().createNamedQuery("User.findByDni", Ciudadano.class).
				setParameter(1, dni).getResultList();
	}

	public static List<Ciudadano> findByEmail(String email) {
		return Jpa.getManager().createNamedQuery("User.findByEmail", Ciudadano.class).
				setParameter(1, email).getResultList();
	}
}
