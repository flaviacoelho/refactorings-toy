package main.java.code.package1;

public class H extends C{

	//Push Down Attribute... (only one subclass in the hierarchy)
	String c = "This fragment is used to Push Down Attribute/Method refactoring!";

	//Push Down Method... (only one subclasses in the hierarchy)
	public String getH() {
		return c;
	}

	//Rename Variable/Parameter...
	public void mH(String v) {
		String r = v + "Rename Variable/Parameter refactorings!";
		System.out.println(r);
	}

}
