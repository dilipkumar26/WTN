/*Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
*/

package com.wipro.Classesandobjects;

public class Calculator {
	static int num1;
	static int num2;
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1,num2); // type casting double into integer
	}
	static double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer power " + powerInt(2,3));
		System.out.println("Double power " + powerDouble(2.5,3)); 
	}

}
