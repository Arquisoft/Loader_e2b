package dbupdate;

import java.io.*;
import java.util.List;

import com.lowagie.text.DocumentException;

import model.Usuario;

/**
 * 
 * @author Ignacio Escribano Burgos
 * Gestiona la conexión con la base de datos
 *
 */
public interface Insert {
	List<Usuario> findByEmail(String email);

	Usuario save(Usuario user);

	List<Usuario> findByDNI(String dni);
}
