package main.java.code.package1;

public class C {
	
	//Move and Rename Attribute...
	String c;
			
	public void mC() {		
		String aux1 = "This fragment is used to ";
		String aux2 = "Extract Variable refactoring!";
		String var = aux1 + aux2;
		System.out.println(var);
	}
	
	//Move Method... (between classes in different packages)
	public void m1C() {
		System.out.println("This fragment is used to Move Method refactoring!");
	}
}
