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
	public  void createLetter(Usuario Usuario){
		document = null;
		FileOutputStream letter = null;
		try {
		letter = new FileOutputStream(
				"cartas/pdf/" + Usuario.getCodigo() + ".pdf");
		document = new Document();
		PdfWriter.getInstance(document, letter);
		document.open();
		if(Usuario instanceof Ciudadano) {
			document.add(new Paragraph("Usuario: " + ((Ciudadano)Usuario).getUsername()
			+ "\n Password: " + ((Ciudadano)Usuario).getPassword()));
		}
				
		
		System.out.println("Se ha generado la carta " + Usuario.getCodigo() + ".pdf correctamente.");
		} catch(DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			document.close();
		}
		
		
	}
}
