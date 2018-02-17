package parser.cartas;

import model.User;

public final class LetterGenerator {
	
	public static void generateTxtLetter(User user) {
		new TxtLetter().createLetter(user);
	}
	
	public static void generateWordLetter(User user) {
		new WordLetter().createLetter(user);
	}
	
	public static void generatePdfLetter(User user) {
		new PdfLetter().createLetter(user);
	}
	
}
