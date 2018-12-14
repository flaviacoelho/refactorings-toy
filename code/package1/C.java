package main.java.code.package1;

public class C {
	
	//Push Down Attribute... (only one subclass in the hierarchy)
	String c = "This fragment is used to Pull Down Attribute/Method refactoring!";
	
	//Push Down Method... (only one subclasses in the hierarchy)
	public String getH() {
		return c;
	}
	
	public void mC() {
		String var = "This fragment is used to " + "Extract Variable refactoring!";
		System.out.println(var);
	}
}
