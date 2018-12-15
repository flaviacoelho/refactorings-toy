package main.java.code.package1;

import main.java.code.package2.*;
import main.java.code.package4.N;

public class Main {
	
	//Move Attribute... (between classes in different packages)
	String a;
		
	public static void main(String ... args) {
		
		B b = new B();
		D d = new D();
		E e = new E();		
		J j = new J();
		N n = new N();
		C c = new C();
		K k = new K();
		H h = new H();
		L l = new L();
		
		System.out.println("This is the Main class of a simple toy!");
		
		m1EA(); //Extract Method
		m1A(); //Extract Method

		m2A(); //Inline Method 
		
		b.m1B(); //Rename Method
		
		d.m1D(); //Move Method
		
		c.m1C(); //Move Method
				
		System.out.println(e.getE()); //Pull Up Attribute/Method		
		
		System.out.println(h.getH()); //Push Down Attribute/Method
		
		System.out.println(l.getK()); //Push Down Attribute/Method
		
		j.mI(); //Extract Interface
		
		b.mM(); //Extract Superclass
		d.mM(); //Extract Superclass
		
		e.mE(); //Move Class 
				//Move and Rename Class
		
		n.mNN(); //Extract and Move Method
		
		c.mC(); //Extract Variable
		
		k.mK(); //Inline Variable
		
		h.mH("This fragment is used to "); //Rename Variable/Parameter
	}
	
	public static void m1EA() {
		//Extract Method... (from main())
		System.out.print("This fragment is used to ");
		System.out.println("Extract Method refactoring!");
	}
	
	public static void m1A() {
		m2EA();
	}
	
	public static void m2EA() {
		//Extract Method... (from another method)
		System.out.print("This fragment is used to ");
		System.out.println("Extract Method refactoring!");
	}
	
	public static void m2A() {
		//Inline Method...
		System.out.print("This fragment is used to ");
		System.out.println("Inline Method refactoring!");
	}
	
}
