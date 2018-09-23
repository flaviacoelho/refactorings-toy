package main.java.util;

public class ClientType {
	
	private String name;
	private String id;
	private String type;
	private Invoice invoice;
	private double bonus;
	private String message;
	
	public ClientType(String name, String id, String type, Invoice invoice) {
		this.name = name;
		this.id = id;
		this.type = type;
		this.invoice = invoice;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public boolean isGolden() {
		applyBonus();
		return (type.equals("Golden"));
	}	
	
	public double calculateDiscount() {
		double discount = 0.2;
		if (isGolden())
			return discount;
		else
			return 0.0;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double applyBonus() {
		this.bonus = 0.05;
		return bonus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
