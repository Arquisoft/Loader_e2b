package modeltest;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.util.Date;

import model.*;
import parser.agentes.ParserCSV;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	User user1 = null;
	User user2 = null;
	User user3 = null;
	User user4 = null;
	User user5 = null;
	User user6 = null;
	
	@Before
	public void setUp() {
		//CreateUser cu = new CreateUser(); //se crea un tipo de ususario u otro según el csv (ParserCSV.class)
		//user1 = cu.newUser("Juan Torres Pardo", null, "juantp@example.com", "90500084Y");
		//user2 = cu.newUser("Sensor Temperatura", "43º 22' N, 5º 50' O", "organizacion1@example.com", "78964566P");
		//user3 = cu.newUser("Luis López Fernandez", null, "luisgf@example.com", "19160962F");
		//user4 = cu.newUser("Sensor humedad", "22º 17' N, 8º 75' S", "organizacion2@example.com", "12348952O");
		//user5 = cu.newUser("Ana García Pérez", null, "anagp@example.com", "09940449X");
		//user6 = cu.newUser("Bomberos de Asturias", null, "bomberosast@example.com", "23548912Z");
	}
	
	@Test
	public void testAll() {
		assertEquals("Juan Torres Pardo", user1.getNombre());
		//assertNull(user1.getLocalizacion());
		assertEquals("juantp@example.com", user1.getEmail());
		//assertEquals("90500084Y", user1.getIdentificador());
		//assertEquals("1", user1.getTipo());
		
		assertEquals("Sensor Temperatura", user2.getNombre());
		//assertEquals("43º 22' N, 5º 50' O", user2.getLocalizacion());
		assertEquals("organizacion1@example.com", user2.getEmail());
		//assertEquals("78964566P", user2.getIdentificador());
		//assertEquals("3", user2.getTipo());
		
		assertEquals("Luis López Fernandez", user3.getNombre());
		//assertNull(user3.getLocalizacion());
		assertEquals("luisgf@example.com", user3.getEmail());
		//assertEquals("19160962F", user3.getIdentificador());
		//assertEquals("1", user3.getTipo());
		
		assertEquals("Sensor humedad", user4.getNombre());
		//assertEquals("22º 17' N, 8º 75' S", user4.getLocalizacion());
		assertEquals("organizacion2@example.com", user4.getEmail());
		//assertEquals("12348952O", user4.getIdentificador());
		//assertEquals("3", user4.getTipo());
		
		assertEquals("Ana García Pérez", user5.getNombre());
		//assertNull(user5.getLocalizacion());
		assertEquals("anagp@example.com", user5.getEmail());
		//assertEquals("09940449X", user5.getIdentificador());
		//assertEquals("1", user5.getTipo());
		
		assertEquals("Bomberos de Asturias", user6.getNombre());
		//assertNull(user6.getLocalizacion());
		assertEquals("bomberosast@example.com", user6.getEmail());
		//assertEquals("23548912Z", user6.getIdentificador());
		//assertEquals("2", user6.getTipo());
	}
	
	@Test
	public void testType() {		
		//assertTrue(user1 instanceof Person);
		//assertFalse(user1 instanceof Sensor);
		//assertFalse(user1 instanceof Entity);
		
		//assertTrue(user2 instanceof Sensor);
		//assertFalse(user2 instanceof Person);
		//assertFalse(user2 instanceof Entity);
		
		//assertTrue(user3 instanceof Person);
		//assertFalse(user3 instanceof Sensor);
		//assertFalse(user3 instanceof Entity);
		
		//assertTrue(user4 instanceof Sensor);
		//assertFalse(user4 instanceof Person);
		//assertFalse(user4 instanceof Entity);
		
		//assertTrue(user5 instanceof Person);
		//assertFalse(user5 instanceof Sensor);
		//assertFalse(user5 instanceof Entity);
		
		//assertTrue(user6 instanceof Entity);
		//assertFalse(user6 instanceof Sensor);
		//assertFalse(user6 instanceof Person);
	}

}
