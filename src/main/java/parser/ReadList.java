package parser;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.lowagie.text.DocumentException;

public interface ReadList {
	public void loadExcel(String path) throws FileNotFoundException;

	public void loadCSV(String path) throws DocumentException, FileNotFoundException;
}
