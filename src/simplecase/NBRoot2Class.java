package simplecase;
public class NBRoot2Class {

	public String name = "";
	double probIfTrue = 0.5;

	public double getProbIfTrue() {
		return probIfTrue;
	}

	public double getProbIfFalse() {
		return 1.0 - probIfTrue;
	}

	public double getProbForClass(boolean classValue) {

		if (classValue) {
			return probIfTrue;
		} else {
			return 1.0 - probIfTrue;
		}
	}

	public NBRoot2Class(String name, double probIfTrue) {
		this.name = name;
		this.probIfTrue = probIfTrue;
	}
}
