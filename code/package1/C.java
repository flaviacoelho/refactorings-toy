package main.java.code.package1;

public class C {

	//Push Down Attribute... (only one subclass in the hierarchy)
	String c = "This fragment is used to Push Down Attribute/Method refactoring!";

	//Push Down Method... (only one subclasses in the hierarchy)
	public String getH() {
		return c;
	}

	//Move Method... (between classes in different packages)
	public void m1C() {
		System.out.println("This fragment is used to Move Method refactoring!");
	}
}
