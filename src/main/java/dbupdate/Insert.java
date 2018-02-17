package dbupdate;

import java.util.List;

import model.User;

/**
 * 
 * @author Ignacio Escribano Burgos
 * Gestiona la conexión con la base de datos
 *
 */
public interface Insert {
	User save(User user);

	List<User> findByDNI(String dni);

	List<User> findByEmail(String email);
}
