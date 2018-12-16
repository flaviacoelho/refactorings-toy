package main.java.code.package1;

import main.java.code.package2.*;
import main.java.code.package3.*;

public class A {
	
	public static void main(String ... args) {
		
		B b = new B();
		D d = new D();
		E e = new E();		
		J j = new J();
		N n = new N();
		H h = new H();
		
		System.out.println("This is the Main class of a simple toy!");
		
		//Extract Method... (from main())
		System.out.print("This fragment is used to ");
		System.out.println("Extract Method refactoring!");		
		
		m1A(); //Extract Method (from another method)

		m2A();  //Inline Method
		
		b.m1(); //Rename Method

		d.m1C(); //Move Method
				
		//System.out.println(e.getE()); //Pull Up Attribute/Method
		
		//System.out.println(h.getH()); //Push Down Attribute/Method
		
		//System.out.println(k.getK()); //Push Down Attribute/Method

		j.mI(); //Extract Interface
		
		b.mM(); //Extract Superclass
		d.mM(); //Extract Superclass
		
		e.mE(); //Move Class
				//Move and Rename Class
		
		n.mNN(); //Extract and Move Method
		
		h.mH("This fragment is used to ");
	}
	
	public static void m1A() {
		//Extract Method... (from another method)
		System.out.print("This fragment is used to ");
		System.out.println("Extract Method refactoring!");
	}
	
	public static void m2A() {
		//Inline Method...
		System.out.print("This fragment is used to ");
		mInlinedMethod();
	}
	
	public static void mInlinedMethod() {
		System.out.println("Inline Method refactoring!");
	}

}
