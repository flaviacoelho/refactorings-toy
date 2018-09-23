package main.java;

public class TelephoneNumber {
	
	private String number;
	private String areaCode;
	
	public String getTelephoneNumber() {
		return ("(" + areaCode + ") " + number);
	}
	
	String getAreaCode() {
		return areaCode;
	}
	
	void setAreaCode(String arg) {
		areaCode = arg;
	}
	
	String getNumber() {
		return number;
	}
	
	void setNumber(String arg) {
		number = arg;
	}
	
	public void testExtract(Person p) {
		setAreaCode("00");
		System.out.println(p.getName());
		setAreaCode("88");
	}
		
}
