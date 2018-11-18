package main.java;

public class A {
	
	public int tmp = 0;

	public int getZeroValue() {
		return isZero() ? 1 : 0;
	}
	
	public boolean isZero() {
		return (tmp == 0);
	}
}
