package parser.cartas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import model.Ciudadano;
import model.Usuario;

public class TxtLetter extends Letter{
	private Writer writer;

	public void createLetter(Usuario user) throws IOException{
		File letter = new File("cartas/txt/" + user.getCodigo() + ".txt");
		writer = new FileWriter(letter);
		if(user instanceof Ciudadano) {
			writer.write("Usuario: " + ((Ciudadano) user).getUsername() + "\n" + "Password: "
				+ ((Ciudadano) user).getPassword());
		}
	}
}
