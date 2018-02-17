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
	public  void createLetter(User user){
		document = null;
		FileOutputStream letter = null;
		try {
		letter = new FileOutputStream(
				"cartas/pdf/" + user.getCodigo() + ".pdf");
		document = new Document();
		PdfWriter.getInstance(document, letter);
		document.open();
		document.add(new Paragraph("Usuario: " + user.getUsername()
				+ "\n Password: " + user.getPassword()));
		
		System.out.println("Se ha generado la carta " + user.getDNI() + ".pdf correctamente.");
		} catch(DocumentException  | FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			document.close();
		}
		
		
	}
}
