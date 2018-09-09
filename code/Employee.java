package main.java;

public abstract class Employee extends Party implements Payable{
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
		
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}	
	
	public String toString() {
		return String.format("%s %s%n Social Security Number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());		
	}
	
	public abstract double earnings();
	
	public String hasSpecialSkill() {
		return "The employee has special skill";
	}
		
}
