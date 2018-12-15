package main.java.code.package1;

public class H extends C{
	
	//Push Down Attribute... (only one subclass in the hierarchy)
	//Rename Attribute
	String h = "This fragment is used to Push Down Attribute/Method refactoring!";

	//Push Down Method... (only one subclasses in the hierarchy)
	public String getH() {
		return h;
	}
	
	//Rename Variable/Parameter...
	public void mH(String in) {
		String out = in + "Rename Variable/Parameter refactorings!";
		System.out.println(out);
	}
	
}
