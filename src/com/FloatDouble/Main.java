package com.FloatDouble;

public class Main {

	public static void main(String[] args) {
		// by default value on right is converted to double datatype
		// to change it we need to cast it by defining the datatype before the value
		//on the right
		// width of 32 (4 bytes)
		int myIntValue = 5/2;
		
		// width of 32 (4 bytes)
		float myFloatValue =  5f/3f;
		
		// width of 64 (8 bytes)
		double myDoubleValue = 5d/3d;
		
		System.out.println("myIntValue " + myIntValue);
		System.out.println("myFloatValue " + myFloatValue);
		System.out.println("myDoubleValue " + myDoubleValue);
		
		int pounds = 200;
		double kg =  pounds * .45359237;
		System.out.println("kg " + kg);
		
		double pi = 3.14_15;
	}

}
