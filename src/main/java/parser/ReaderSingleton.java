package parser;

import java.io.FileNotFoundException;
import java.util.logging.Level;

import com.lowagie.text.DocumentException;

import reportwriter.ReportWriter;

public class ReaderSingleton {
	private static ReaderSingleton instance;
	private ReadList loader;

	private ReaderSingleton() {
		this.loader = new RList();
	}

	public static ReaderSingleton getInstance() {
		if (instance == null)
			instance = new ReaderSingleton();
		return instance;
	}

	public void loadFile(String csv, String excel) throws DocumentException {
		try{
			loader.loadCSV(csv);
			loader.loadExcel(excel);
		}catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el archivo excel especificado.");
			ReportWriter.getInstance().getWriteReport().log(Level.WARNING, "No se ha encontrado el archivo excel");
		}
	}
}
