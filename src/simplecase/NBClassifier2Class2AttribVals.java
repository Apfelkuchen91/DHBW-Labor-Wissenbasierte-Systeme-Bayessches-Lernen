package simplecase;




public class NBClassifier2Class2AttribVals {

	public String name = "";

	// TODO Welche Attribute definieren eigentlich einen Naiven Bayes-Klassifikator? Die m�ssen hier noch deklariert werden!

	public NBClassifier2Class2AttribVals(String name) {
		this.name = name;
	}

	/**
	 * TODO Initialisierung-Methoden f�r den Klassifikator:
	 * 
	 * F�r die oben angelegten Attribute m�ssen Werte gesetzt und evtl. auch wieder gelesen werden k�nnen.
	 */


	
	public void classifyQueryRaw(SimpleInstance query) {
		
		/**
		 * TODO Hier fehlt noch die Berechnung der bedingten Wahrscheinlich f�r eine konkrete Anfrage (unskaliert).
		 * 
		 * Ein geeigneter Ergebnistyp muss noch gew�hlt werden daf�r.
		 */

		return;
	}

	public void classifyQueryNormalized(SimpleInstance query) {
		/**
		 * TODO Hier fehlt noch die Berechnung der normalisierten Wahrscheinlichkeiten f�r eine konkrete Anfrage.
		 * 
		 * Ein geeigneter Ergebnistyp muss noch gew�hlt werden daf�r.
		 */

		return;
	}

	public boolean classify(SimpleInstance query) {
		boolean res = true;
		
		// TODO Eigentlich muss der folgende Aufruf ein Ergebnis liefern, dass dann entsprechend weiterverarbeitet werden kann.
		classifyQueryRaw(query);

		/**
		 * TODO Das Ergebnis des obigen Aufrufs muss hier verarbeitet werden, um abh�ngig davon ein Klassifikationsergebnis zu bestimmen.
		 */

		return res;
	}

	public double calcRootProbability(boolean rootClassVal, SimpleInstance query) {
		double res = 0.0;
		
		/**
		 *  TODO Hier muss mit der bekannten Bayes-Formel als Ergebnis die Wahrscheinlichkeit einer bestimmten
		 *       Klasse bei gegebenen Attributwerten berechnet werden.
		 */

		return res;
	}

	public void learnClassifier(/* Abh�ngig vom Format der aus Datei gelesenen Werten werden hier Parameter ben�tigt.  */) {
		// TODO Hier muss das Klassifikator auf einen "leeren" Zustand zur�ckgesetzt werden, ggf. k�nnen weitere lokale Variablen deklariert werden.
		
		/**
		 * TODO Hier m�ssen die ben�tigten Werte f�r den Klassifikator aus z.B. den aus einer Datei gelesen Lerndaten
		 *      berechnet werden.
		 */
	}


}
