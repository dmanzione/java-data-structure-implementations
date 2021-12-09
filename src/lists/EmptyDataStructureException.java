package lists;

public class EmptyDataStructureException extends Exception {
	String dataStructure;
	public EmptyDataStructureException(String dataStructure) {
		this.dataStructure = dataStructure;
	}
	@Override
	public String toString() {
		return dataStructure + " is empty.";
	}

}
