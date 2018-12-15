package main.java.code.package2;

import main.java.code.package3.P;
import main.java.code.package4.N;

public class E {
	N n = new N();
	P o = new P();
	
	//Pull Up Attribute...
	String e = "This fragment is used to Pull Up Attribute/Method refactoring!";

	//Pull Up Method...
	public String getE() {
		return e;
	}
	
	public void mE() {
		n.mN();
		o.mP();
	}	
	
}
