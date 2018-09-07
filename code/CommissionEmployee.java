package main.java;

public class CommissionEmployee extends Employee{
	
	private double grossSales; 	//vendas brutas semanais
	private double commissionRate; 	//porcentagem da comissao
	
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
							  double grossSales, double commissionRate) {
		
		super(firstName, lastName, socialSecurityNumber);		
		
		commissionRateException(commissionRate);
		
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public void commissionRateException(double commissionRate) {
		if ((commissionRate <= 0.0) || (commissionRate >= 1.0))
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {	
		commissionRateException(commissionRate);
		this.commissionRate = commissionRate;
	}
	
	
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}
		
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "Comission employee", super.toString(),
							 "Gross sales: ", getGrossSales(), "Commission rate: ", getCommissionRate());
	}
	
}
