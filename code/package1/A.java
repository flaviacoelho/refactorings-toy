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
		C c = new C();
		K k = new K();
		H h = new H();
		
		System.out.println("This is the Main class of a simple toy!");
		
		//Extract Method... (from main())
		System.out.print("This fragment is used to ");
		System.out.println("Extract Method refactoring!");		
		
		m1A(); 
		m2A(); 
		
		b.m1();
		b.m1D();
		
		d.m1C();
				
		//System.out.println(e.getE());		
		
		//System.out.println(h.getH());
		
		//System.out.println(k.getK());
		j.mI();
		
		b.mM();
		d.mM();
		
		e.mE();
		
		n.mNN();
		
		c.mC();
		
		k.mK();
		
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
