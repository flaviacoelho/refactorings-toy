package main.java.code.package2;

public class D {
	
	//Move Attribute... (between classes in different packages)
	String a;
	
	
	//Move Method... (between classes in different packages)
	public void m1C() {
		System.out.println("This fragment is used to Move Method refactoring!");
	}
	
	//Extract Superclass...
		public void mM() {
			System.out.println("This fragment is used to Extract Superclass refactoring!");
	}
}
