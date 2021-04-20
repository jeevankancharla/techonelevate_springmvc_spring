package com.tyss.springcore.corejava;

public class TestOverload {
	
	int a = 4;
	int b = 2;
	double d = 1.2;
	double e =2.4;
	
	public void go(int a , int b) {
		int r = a/b;
		
	}

	public double go(double d,double e ) {
		double  add = d+e;
		return add;
	}
}
