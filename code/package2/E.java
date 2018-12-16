package main.java.code.package2;

import main.java.code.package4.O;
import main.java.code.package4.T;

public class E {
	T t = new T();
	O o = new O();

	//Pull Up Attribute...
	String e = "This fragment is used to Pull Up Attribute/Method refactoring!";

	//Pull Up Method...
	public String getE() {
		return e;
	}

	public void mE() {
		t.mT();
		o.mP();
	}	

}
