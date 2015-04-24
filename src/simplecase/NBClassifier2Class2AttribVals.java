package simplecase;




public class NBClassifier2Class2AttribVals {

	public String name = "";

	// TODO Welche Attribute definieren eigentlich einen Naiven Bayes-Klassifikator? Die müssen hier noch deklariert werden!

	public NBClassifier2Class2AttribVals(String name) {
		this.name = name;
	}

	/**
	 * TODO Initialisierung-Methoden für den Klassifikator:
	 * 
	 * Für die oben angelegten Attribute müssen Werte gesetzt und evtl. auch wieder gelesen werden können.
	 */


	
	public void classifyQueryRaw(SimpleInstance query) {
		
		/**
		 * TODO Hier fehlt noch die Berechnung der bedingten Wahrscheinlich für eine konkrete Anfrage (unskaliert).
		 * 
		 * Ein geeigneter Ergebnistyp muss noch gewählt werden dafür.
		 */

		return;
	}

	public void classifyQueryNormalized(SimpleInstance query) {
		/**
		 * TODO Hier fehlt noch die Berechnung der normalisierten Wahrscheinlichkeiten für eine konkrete Anfrage.
		 * 
		 * Ein geeigneter Ergebnistyp muss noch gewählt werden dafür.
		 */

		return;
	}

	public boolean classify(SimpleInstance query) {
		boolean res = true;
		
		// TODO Eigentlich muss der folgende Aufruf ein Ergebnis liefern, dass dann entsprechend weiterverarbeitet werden kann.
		classifyQueryRaw(query);

		/**
		 * TODO Das Ergebnis des obigen Aufrufs muss hier verarbeitet werden, um abhängig davon ein Klassifikationsergebnis zu bestimmen.
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

	public void learnClassifier(/* Abhängig vom Format der aus Datei gelesenen Werten werden hier Parameter benötigt.  */) {
		// TODO Hier muss das Klassifikator auf einen "leeren" Zustand zurückgesetzt werden, ggf. können weitere lokale Variablen deklariert werden.
		
		/**
		 * TODO Hier müssen die benötigten Werte für den Klassifikator aus z.B. den aus einer Datei gelesen Lerndaten
		 *      berechnet werden.
		 */
	}


}
