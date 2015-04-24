package simplecase;
import java.util.HashMap;
import java.util.Map;

public class NBLeaf2Val2Class {

	public String name = "";
	Map<String, Double> condProbClassTrue = new HashMap<String, Double>();
	Map<String, Double> condProbClassFalse = new HashMap<String, Double>();

	public NBLeaf2Val2Class(String name) {
		this.name = name;
	}

	public void addCondProb(String attribVal, double cpClassTrue,
			double cpClassFalse) {
		condProbClassTrue.put(attribVal, cpClassTrue);
		condProbClassFalse.put(attribVal, cpClassFalse);
	}

	public double getCondProb(String attribVal, boolean classVal) {
		if (classVal) {
			return condProbClassTrue.get(attribVal);
		} else {
			return condProbClassFalse.get(attribVal);
		}
	}

}
