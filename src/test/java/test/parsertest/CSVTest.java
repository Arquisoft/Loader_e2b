package test.parsertest;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

import parser.agentes.ParserCSV;

public class CSVTest {

	ParserCSV parser = null;

	@Before
	public void setUp() {
		parser = new ParserCSV();
	}

	@Test
	public void testOK() throws IOException {
		Map<String, String> datos = parser.read("users.csv");

		StringBuilder sb = new StringBuilder();

		for (Entry<String, String> entry : datos.entrySet()) {
			sb.append("[" + entry.getKey() + "," + entry.getValue() + "]");
		}

		assertEquals(sb.toString(), "[2,Entity][3,Sensor][﻿1,Person]");
	}

	@Test(expected = FileNotFoundException.class)
	public void testFileNotFoundException() throws IOException {
		ParserCSV parser = new ParserCSV();
		Map<String, String> datos = parser.read("usuarios.csv");

		StringBuilder sb = new StringBuilder();

		for (Entry<String, String> entry : datos.entrySet()) {
			sb.append("[" + entry.getKey() + "," + entry.getValue() + "]");
		}

		assertEquals(sb.toString(), "[2,Entity][3,Sensor][﻿1,Person]");
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testEmptyFile() throws IOException {
		ParserCSV parser = new ParserCSV();
		Map<String, String> datos = parser.read("vacio.csv");

		StringBuilder sb = new StringBuilder();

		for (Entry<String, String> entry : datos.entrySet()) {
			sb.append("[" + entry.getKey() + "," + entry.getValue() + "]");
		}

		assertEquals(sb.toString(), "[2,Entity][3,Sensor][﻿1,Person]");
	}
}
