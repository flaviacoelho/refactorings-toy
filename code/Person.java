package main.java.other;

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
		officeTelephone.testExtract(this);
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
