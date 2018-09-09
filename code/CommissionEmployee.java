package main.java;

public class CommissionEmployee extends Employee{
	
	private double grossSales; 	//vendas brutas semanais
	private double commissionRate; 	//porcentagem da comissao
	
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
							  double grossSales, double commissionRate) {
		
		super(firstName, lastName, socialSecurityNumber);		
		
		commissionRateHandleException(commissionRate);
		
		grossSalesHandleException(grossSales);
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public void grossSalesHandleException(double grossSales) {
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");		
	}
	
	public void commissionRateHandleException(double commissionRate) {
		if ((commissionRate <= 0.0) || (commissionRate >= 1.0))
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		grossSalesHandleException(grossSales);		
		this.grossSales = grossSales;
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {	
		commissionRateHandleException(commissionRate);
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
