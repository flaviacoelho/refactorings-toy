package main.java;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary; //salario base por semana

	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		baseSalaryException(baseSalary);
		
		this.baseSalary = baseSalary;
	}
	
	public void baseSalaryException(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		
		baseSalaryException(baseSalary);
		
		this.baseSalary = baseSalary;
	}
	
	
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", "Base-salaried: ", super.toString(), "Base salary: ",
							 getBaseSalary());
	}

}
