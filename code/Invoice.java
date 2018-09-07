package main.java;

public class Invoice implements Payable{
	
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		
		quantityException(quantity);
		
		if(pricePerItem < 0)
			throw new IllegalArgumentException("Price per item must be >= 0.0");
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
		
	}
	
	public void quantityException(int quantity) {
		if(quantity < 0)
			throw new IllegalArgumentException("Quantity must be >= 0.0");
	}
	
	
	public String getPartNumber() {
		return partNumber;
	}
	
	
	public String getPartDescription() {
		return partDescription;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		
		quantityException(quantity);
		
		this.quantity = quantity;
	}


	public double getPricePerItem() {
		return pricePerItem;
	}


	public void setPricePerItem(double pricePerItem) {
		
		if(pricePerItem < 0)
			throw new IllegalArgumentException("Price per item must be >= 0.0");
		
		this.pricePerItem = pricePerItem;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %n%s: %s (%s) %n%: %d %n%s: $%,.2f", "invoice", "part number",
							 getPartNumber(), getPartDescription(), "quantity", getQuantity(),
							 "price per item", getPricePerItem());
	}
	
	
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}
	
}
