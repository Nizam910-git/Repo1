package com.actitime.pom;

public class A {

	private int i ;   //declaration

	public A(int j) {
		i=j;			//initialization
	}

	public int getValue() {			//Giving read access or we can only read the value
		return i;
	}

	public void setValue(int k) {	//Giving write access or we can set the value
		i=k;						//utilization
	}

}
