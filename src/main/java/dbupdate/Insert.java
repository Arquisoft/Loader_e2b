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

	List<Ciudadano> findByEmail(String email);

	Usuario save(Usuario user) throws FileNotFoundException, DocumentException, IOException;
}
