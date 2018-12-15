package main.java.code.package2;

public class B {
	
	//Move Attribute... (between classes in the same package)
	String d;
	
	
	//Rename Method...
	public void m1() {
		System.out.println("This fragment is used to Rename Method refactoring!");
	}
	
	//Move Method... (between classes in the same package)
	public void m1D() {
		System.out.println("This fragment is used to Move Method refactoring!");
	}
	
	//Extract Superclass...
	public void mM() {
		System.out.println("This fragment is used to Extract Superclass refactoring!");
	}

}