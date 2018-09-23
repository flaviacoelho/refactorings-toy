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
	
	public void testExtractAndMoveMethod() {
		officeTelephone.setAreaCode("00");
		System.out.println(getName());
		officeTelephone.setAreaCode("88");
	}
	
}

class SpecialPerson{ 
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
