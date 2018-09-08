package main.java;

public class ClientType {
	
	private String name;
	private String id;
	private String type;
	private Invoice invoice;
	
	public ClientType(String name, String id, String type) {
		this.name = name;
		this.id = id;
		this.type = type;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public boolean isGolden() {
		invoice.applyBonus();
		return (type.equals("Golden"));
	}	
	
	public double calculateDiscount() {
		double discount = 0.2;
		if (isGolden())
			return discount;
		else
			return 0.0;
	}
	
}
