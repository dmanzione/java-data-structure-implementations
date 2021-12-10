package exceptions;

public class EmptyDataStructureException extends Exception {
	String dataStructure;
	String operationName;

	public EmptyDataStructureException(String dataStructure, String operationName) {
		this.dataStructure = dataStructure;
		this.operationName = operationName;
	}

	@Override
	public String toString() {

		return dataStructure + " is empty. Nothing to " + operationName;
	}

}
