package simplecase;

import java.io.BufferedReader;
import java.io.FileReader;


public class SimpleInstanceReader {

	private boolean isValid = false;
	private String filename = "";

	/**
	 *  TODO Welche Werte werden aus der Datei gelesen?
	 *  
	 *  Hier m�ssen noch geeignete Attribute deklariert werden.
	 */
	

	public SimpleInstanceReader(String filename) {
		this.filename = filename;
	}

	public boolean readFile() {
		boolean res = true;
		// TODO Werden weitere Variablen f�r das Lesen der Datei ben�tigt?

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
					// TODO parseLine muss irgendwie den Inhalt der geparsten Zeile �bergeben k�nnen ...
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
		 *  TODO Hier fehlt ein geeigneter R�ckgabetyp und das Bereitstellen der Werte.
		 *  
		 *  Das h�ngt nat�rlich auch von der Art des zugeh�rigen Attributs ab.
		 */
		
		return;
	}

	public void getInstances() {
		/**
		 *  TODO Hier fehlt ein geeigneter R�ckgabetyp und das Bereitstellen der Werte.
		 *  
		 *  Das h�ngt nat�rlich auch von der Art des zugeh�rigen Attributs ab.
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
		// TODO Lokale Variablen deklarieren, die f�r das Parsen der Zeile ben�tigt werden.

		String[] tokens = line.split(",");

		/**
		 * TODO Hier m�ssen die Werte der aufgeteilten Zeile geeignet �bernommen werden.
		 * 
		 * Die Details h�ngen von den gew�hlten Datenstrukturen ab.
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
