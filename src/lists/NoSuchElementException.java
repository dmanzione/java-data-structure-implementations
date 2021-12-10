package lists;

public class NoSuchElementException extends Exception {
	
	private String dataStructure;
	private String element;

	public NoSuchElementException(String dataStructure, String element) {
		this.dataStructure = dataStructure;
		this.element = element;
	}
	
	@Override
	public String toString() {
		
		return element + " is not in " + dataStructure;
	}
}
