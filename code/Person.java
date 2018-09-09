package main.java;

public class Person {
		
	private String name;
	private TelephoneNumber officeTelephone = new TelephoneNumber();
	
	public String getName() {
		return name;
	}
	
	public String getTelephoneNumber(){
		return officeTelephone.getTelephoneNumber();
	}
	
	TelephoneNumber getOfficeTelephone() {
		return officeTelephone;
	}	
}
