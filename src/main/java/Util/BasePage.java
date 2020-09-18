package Util;

public class BasePage {
	
	public void Assertion(String Message,String expected, String Actual) {
		if(!Actual.equalsIgnoreCase(expected)) {
		throw new RuntimeException (Message);
		}
	
	}

}
