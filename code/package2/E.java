package main.java.code.package2;

import main.java.code.package3.P;
import main.java.code.package3.T;

public class E {
	T t = new T();
	P o = new P();

	public void mE() {
		t.mT();
		o.mP();
	}

	//Pull Up Attribute...
	String e = "This fragment is used to Pull Up Attribute/Method refactoring!";

	//Pull Up Method...
	public String getE() {
		return e;
	}

}
