package dbupdate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.lowagie.text.DocumentException;

import model.Ciudadano;
import model.Usuario;

/**
 * 
 * @author Ignacio Escribano Burgos
 * Gestiona la conexión con la base de datos
 *
 */
public interface Insert {
	List<Ciudadano> findByDNI(String dni);

	List<Ciudadano> findByEmail(String email);

	Usuario save(Usuario user) throws FileNotFoundException, DocumentException, IOException;
}
