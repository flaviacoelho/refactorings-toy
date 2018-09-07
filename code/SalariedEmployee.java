package main.java;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;

	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, 
							double weeklySalary) {		
		super(firstName, lastName, socialSecurityNumber);
		weeklySalaryException(weeklySalary);		
		this.weeklySalary = weeklySalary;
	}
	
	public void weeklySalaryException(double weeklySalary) {
		if(weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	}
	
	public int getZeroValueOfWeeklySalary() { 
		return (weeklySalary == 0) ? 1 : 0;		
	}
	
	public void setWeeklySalary(double weeklySalary) {	
		weeklySalaryException(weeklySalary);		
		this.weeklySalary = weeklySalary;
	}
	
	
	public double getWeeklySalary() {		
		return weeklySalary;	
	}
	
	
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}
	
	@Override
	public String toString() {		
		return String.format("Salaried employee: %s%n%s: $%,.2f", super.toString(), 
							 "Weekly salary: ", getWeeklySalary());
		
	}
	
}
