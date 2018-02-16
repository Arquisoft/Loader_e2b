package parser.cartas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import model.Ciudadano;
import model.Usuario;

public class PdfLetter extends Letter{
	private Document document;
	public  void createLetter(Usuario user) throws DocumentException, FileNotFoundException{
		document = null;
		FileOutputStream letter = null;
		letter = new FileOutputStream(
				"cartas/pdf/" + user.getCodigo() + ".pdf");
		document = new Document();
		PdfWriter.getInstance(document, letter);
		document.open();
		if(user instanceof Ciudadano) {
			document.add(new Paragraph("Usuario: " + ((Ciudadano) user).getUsername()
			+ "\n Password: " + ((Ciudadano) user).getPassword()));
		}
				
		document.close();
	}
}
