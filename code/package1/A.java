package main.java.code.package1;

import main.java.code.package2.*;
import main.java.code.package3.*;

public class A {

	//Move Attribute... (between classes in different packages)
	String a;

	//Rename Atribute
	String w;

	public static void main(String ... args) {

		B b = new B();
		D d = new D();
		E e = new E();		
		J j = new J();
		N n = new N();
		H h = new H();
		C c = new C();

		System.out.println("This is the Main class of a simple toy!");

		m1EM();

		m1A(); //Extract Method (from another method)

		m2A();  //Inline Method

		b.m1B(); //Rename Method

		c.m1C(); //Move Method

		System.out.println(e.getE()); //Pull Up Attribute/Method
		System.out.println();
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

	public static void m1EM() {
		//Extract Method... (from main())
		System.out.print("This fragment is used to ");
		System.out.println("Extract Method refactoring!");
	}

	public static void m1A() {
		m2EM();
	}

	public static void m2EM() {
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
