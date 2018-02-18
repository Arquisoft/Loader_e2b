package test.modeltest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Ciudadano;
import model.Usuario;

public class UserTest {

	Usuario user1 = null;
	Usuario user2 = null;
	Usuario user3 = null;
	Usuario user4 = null;
	Usuario user5 = null;
	Usuario user6 = null;

	@Before
	public void setUp() {
		user1 = new Ciudadano("Juan Torres Pardo", "juantp@example.com", "90500084Y");
		//user2 = new Sensor("Sensor Temperatura", "43º 22' N, 5º 50' O", "organizacion1@example.com", "78964566P");
		user3 = new Ciudadano("Luis López Fernandez", "luisgf@example.com", "19160962F");
		//user4 = new Sensor("Sensor humedad", "22º 17' N, 8º 75' S", "organizacion2@example.com", "12348952O");
		user5 = new Ciudadano("Ana García Pérez", "anagp@example.com", "09940449X");
		//user6 = new Entidad("Bomberos de Asturias", null, "bomberosast@example.com", "23548912Z");
	}

	@Test
	public void testAll() {
		assertEquals("Juan Torres Pardo", user1.getNombre());
		assertEquals("juantp@example.com", user1.getEmail());
		assertEquals("90500084Y", user1.getCodigo());

		/*assertEquals("Sensor Temperatura", user2.getNombre());
		assertEquals("43º 22' N, 5º 50' O", user2.getLocalizacion());
		assertEquals("organizacion1@example.com", user2.getEmail());
		assertEquals("78964566P", user2.getIdentificador());
		assertEquals("3", user2.getTipo());
		 */
		
		assertEquals("Luis López Fernandez", user3.getNombre());
		assertEquals("luisgf@example.com", user3.getEmail());
		assertEquals("19160962F", user3.getCodigo());

		/*assertEquals("Sensor humedad", user4.getNombre());
		assertEquals("22º 17' N, 8º 75' S", user4.getLocalizacion());
		assertEquals("organizacion2@example.com", user4.getEmail());
		assertEquals("12348952O", user4.getIdentificador());
		assertEquals("3", user4.getTipo());
		 */
		
		assertEquals("Ana García Pérez", user5.getNombre());
		assertEquals("anagp@example.com", user5.getEmail());
		assertEquals("09940449X", user5.getCodigo());

		/*assertEquals("Bomberos de Asturias", user6.getNombre());
		assertNull(user6.getLocalizacion());
		assertEquals("bomberosast@example.com", user6.getEmail());
		assertEquals("23548912Z", user6.getIdentificador());
		assertEquals("2", user6.getTipo());*/
	}

	@Test
	public void testType() {
		assertTrue(user1 instanceof Ciudadano);
		//assertFalse(user1 instanceof Sensor);
		//assertFalse(user1 instanceof Entity);
		
		//assertTrue(user2 instanceof Sensor);
		assertFalse(user2 instanceof Ciudadano);
		//assertFalse(user2 instanceof Entity);
		
		assertTrue(user3 instanceof Ciudadano);
		//assertFalse(user3 instanceof Sensor);
		//assertFalse(user3 instanceof Entity);

		//assertTrue(user4 instanceof Sensor);
		assertFalse(user4 instanceof Ciudadano);
		//assertFalse(user4 instanceof Entity);

		assertTrue(user5 instanceof Ciudadano);
		//assertFalse(user5 instanceof Sensor);
		//assertFalse(user5 instanceof Entity);

		//assertTrue(user6 instanceof Entity);
		//assertFalse(user6 instanceof Sensor);
		assertFalse(user6 instanceof Ciudadano);
	}

}
