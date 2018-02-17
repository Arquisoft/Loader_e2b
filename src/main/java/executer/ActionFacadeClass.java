package executer;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.lowagie.text.DocumentException;

import dbupdate.Insert;
import dbupdate.InsertP;
import model.Ciudadano;

public class ActionFacadeClass implements ActionFacade {

	@Override
	public void saveData(Ciudadano user) throws FileNotFoundException, DocumentException, IOException {
		Insert insert = new InsertP();
		insert.save(user);
			
	}
}