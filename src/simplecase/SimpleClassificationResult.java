package simplecase;
public class SimpleClassificationResult {

	public double condProbTrue = 0.0;
	public double condProbFalse = 0.0;

	public SimpleClassificationResult(double probTrue, double probFalse) {
		condProbTrue = probTrue;
		condProbFalse = probFalse;
	}

}
