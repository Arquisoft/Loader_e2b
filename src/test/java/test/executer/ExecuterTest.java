package test.executer;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import com.lowagie.text.DocumentException;

import executer.ActionSingleton;
import model.Ciudadano;
import model.Usuario;
import persistence.UserFinder;
import persistence.util.Jpa;

public class ExecuterTest {

	@Test
	public void testActionSingleton() throws FileNotFoundException, DocumentException, IOException {
		ActionSingleton aS = ActionSingleton.getInstance();
		ActionSingleton aS2 = ActionSingleton.getInstance();
		
		assertEquals(aS, aS2);
		
		Date date = new Date(System.currentTimeMillis());
		Usuario Usuario = new Ciudadano("Paco", "francisco@gmail.com", "87654321P");
		
		aS.getAF().saveData(Usuario);
		
		EntityManager mapper = Jpa.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();
		
		Usuario Usuario2 = UserFinder.findByEmail("francisco@gmail.com").get(0);
		
		assertEquals(Usuario, Usuario2);
		
		trx.commit();
		
	}

}
