package simplecase;


public class NaiveBayesExample {

	private static void testLeafClass() {
		System.out.println("\n  -- Test of NBLeaf2Val2Class class --");

		NBLeaf2Val2Class leaf = new NBLeaf2Val2Class("Type");
		leaf.addCondProb("SUV", 0.2, 0.6);
		leaf.addCondProb("Sport", 0.8, 0.4);

		System.out.println("P(SUV|Stolen?==true) = "
				+ leaf.getCondProb("SUV", true));
	}

	private static void printClassification(NBClassifier2Class2AttribVals classifier, SimpleInstance query) {
		/**
		 *  TODO In den folgenden Ausgaben müssen nach Implementierung der Klassifikationsmethoden noch
		 *       die Ergebniswerte entsprechend übernommen und ausgegeben werden!
		 */
		
		classifier.classifyQueryRaw(query);
		System.out.println("Result for  true|" + query + ":  " + "-1");
		System.out.println("Result for false|" + query + ":  " + "-1");
		System.out.println();
		classifier.classifyQueryNormalized(query);
		System.out.println("Norm. result for  true|" + query + ":  " + "-1");
		System.out.println("Norm. result for false|" + query + ":  " + "-1");
		System.out.println();
		System.out.println("Classification of " + query + ":  " + classifier.classify(query));
	}

	private static void testNBClassifierClass() {
		System.out.println("\n  -- Test of NBClassifierClass class: Stolen Cars --");

		NBClassifier2Class2AttribVals classifier = new NBClassifier2Class2AttribVals(
				"Decide Car Check");
		
		/** TODO Irgendwie muss der Klassifikator initialisiert werden. Eine mögliche Variante von Aufrufen könnte so aussehen:
		 * 
		 * 		classifier.setRoot("Stolen?", 0.5);
		 * 		classifier.addAttributeCondProb("Color", "Red", 0.6, 0.4);
		 * 		classifier.addAttributeCondProb("Color", "Yellow", 0.4, 0.6);
		 * 		classifier.addAttributeCondProb("Origin", "Domestic", 0.4, 0.6);
		 * 		classifier.addAttributeCondProb("Origin", "Imported", 0.6, 0.4);
		 * 		classifier.addAttributeCondProb("Type", "Sport", 0.8, 0.4);
		 * 		classifier.addAttributeCondProb("Type", "SUV", 0.2, 0.6);
		 * 
		 */

		System.out.println(classifier);

		SimpleInstance query = new SimpleInstance();
		query.addAttributeVal("Color", "Red");
		query.addAttributeVal("Type", "SUV");
		query.addAttributeVal("Origin", "Domestic");

		printClassification(classifier, query);
	}

	private static void testInstanceReading() {
		SimpleInstanceReader reader = new SimpleInstanceReader("data/cartheft.txt");

		System.out.println("\n  -- Test of Instance loading --");

		reader.readFile();
		System.out.println(reader);
	}

	private static void testNBLearning() {
		SimpleInstanceReader reader = new SimpleInstanceReader(
				"data/cartheft.txt");

		System.out.println("\n  -- Test of learning classifier --");

		reader.readFile();
		NBClassifier2Class2AttribVals classifier = new NBClassifier2Class2AttribVals(
				"Decide Car Check");
		classifier.learnClassifier();

		System.out.println(classifier);
		
		SimpleInstance query = new SimpleInstance();
		query.addAttributeVal("Color", "Red");
		query.addAttributeVal("Type", "SUV");
		query.addAttributeVal("Origin", "Domestic");

		printClassification(classifier, query);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" === Naive Bayes Examples ===\n");

		testLeafClass();

		testNBClassifierClass();

		testInstanceReading();

		testNBLearning();
	}

}
