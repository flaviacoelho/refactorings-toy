package main.java.code.package1;

public class J {
	
	//Push Down Attribute... (two subclass in the hierarchy)
	String k = "This fragment is used to Push Down Attribute/Method refactoring!";
		
	//Push Down Method... (two subclasses in the hierarchy)
	public String getK() {
		return k;
	}
	
	//Extract Interface...
	public void mI() {
		System.out.println("This fragment is used to Extract Interface refactoring!");
	}
}
