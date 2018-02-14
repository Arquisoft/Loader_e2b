package parser.agentes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class ParserCSV {

	public Map<String, String> read() throws IOException {
		CSVReader reader = null;
		Map<String, String> map = new HashMap<String, String>();
		try {
			reader = new CSVReader(new FileReader("users.csv"));
		
			List<String[]> datos = reader.readAll();
			
			for(String[] linea: datos) {
				map.put(linea[0], linea[1]);
			}
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("No se encuentra el fichero " + e);
		} finally {
			if (reader != null)
				reader.close();
		}
		return map;
	}
}
