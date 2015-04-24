package simplecase;

import java.io.BufferedReader;
import java.io.FileReader;


public class SimpleInstanceReader {

	private boolean isValid = false;
	private String filename = "";

	/**
	 *  TODO Welche Werte werden aus der Datei gelesen?
	 *  
	 *  Hier müssen noch geeignete Attribute deklariert werden.
	 */
	

	public SimpleInstanceReader(String filename) {
		this.filename = filename;
	}

	public boolean readFile() {
		boolean res = true;
		// TODO Werden weitere Variablen für das Lesen der Datei benötigt?

		try {
			BufferedReader br = new BufferedReader(
					new FileReader(this.filename));

			String line;
			boolean readNames = true;
			while ((line = br.readLine()) != null) {
				if (line.charAt(0) == '#')
					continue;
				if (readNames) {
					parseNames(line);
					readNames = false;
				} else {
					// TODO parseLine muss irgendwie den Inhalt der geparsten Zeile übergeben können ...
					parseLine(line);
				}
			}
		} catch (Exception e) {
			res = false;
		}

		isValid = res;
		return res;
	}

	public String getClassName() {
		// TODO da fehlt noch was ...
		return "";
	}

	public void getAttributeNames() {
		/**
		 *  TODO Hier fehlt ein geeigneter Rückgabetyp und das Bereitstellen der Werte.
		 *  
		 *  Das hängt natürlich auch von der Art des zugehörigen Attributs ab.
		 */
		
		return;
	}

	public void getInstances() {
		/**
		 *  TODO Hier fehlt ein geeigneter Rückgabetyp und das Bereitstellen der Werte.
		 *  
		 *  Das hängt natürlich auch von der Art des zugehörigen Attributs ab.
		 */
		
		return;
	}

	private boolean parseNames(String line) {
		String[] tokens = line.split(",");

		if (tokens.length < 2) {
			return false;
		}

		/**
		 * TODO Hier fehlt noch was mit den gelesenen Werten angefangen werden soll.
		 * 
		 * Dran denken: Der erste Wert ist die Bezeichnung der zu erkennenden Klasse (Wurzelknoten),
		 * die weiteren Werte sind die Bezeichnungen der Attribute.
		 */		

		return true;
	}

	private void parseLine(String line) {
		// TODO Lokale Variablen deklarieren, die für das Parsen der Zeile benötigt werden.

		String[] tokens = line.split(",");

		/**
		 * TODO Hier müssen die Werte der aufgeteilten Zeile geeignet übernommen werden.
		 * 
		 * Die Details hängen von den gewählten Datenstrukturen ab.
		 */
		
		return ;
	}

	/**
	 * Helper function to parse a string into a boolean value.
	 * 
	 * All variants of "ja", "yes" and "true" are consideres as true,
	 * everything else is parsed to false.
	 * 
	 * @param token
	 * @return
	 */
	private boolean parseBoolString(String token) {
		boolean res = false;
		String normToken = token.trim().toLowerCase();

		if (normToken.startsWith("ja") || normToken.startsWith("true")
				|| normToken.startsWith("yes")) {
			res = true;
		}

		return res;
	}

}
