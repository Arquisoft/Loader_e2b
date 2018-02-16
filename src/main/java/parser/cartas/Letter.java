package parser.cartas;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.lowagie.text.DocumentException;

import model.Ciudadano;
import model.Usuario;

public abstract class Letter {
		public abstract void createLetter(Usuario user) throws DocumentException, FileNotFoundException, IOException;
}
