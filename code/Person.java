package main.java;

public class Person {
		
	private String name;
	private PhoneNumber officeTelephone = new PhoneNumber();
	
	public String getName() {
		return name;
	}
	
	public String getTelephoneNumber(){
		return officeTelephone.getTelephoneNumber();
	}
	
	PhoneNumber getOfficeTelephone() {
		return officeTelephone;
	}	
}
