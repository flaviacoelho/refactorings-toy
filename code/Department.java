package main.java;

public class Department extends Party{
	
	private String name;
	private String quota;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}
	
	public void testRenameMethod() {
		System.out.println("A simple test...");
	}
	
}
