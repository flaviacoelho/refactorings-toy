package main.java;

public class ClientType {
	
	private String name;
	private String id;
	private String type;
	
	public ClientType(String name, String id, String type) {
		this.name = name;
		this.id = id;
		this.type = type;
	}
	
	public boolean isGolden() {
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
