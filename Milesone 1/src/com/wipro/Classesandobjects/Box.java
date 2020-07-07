/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
 * The dimensions of the Box are width, height, depth. 
 * The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.*/

package com.wipro.Classesandobjects;

public class Box {
	int height;
	int width;
	int depth;
	Box(int a,int b,int c)
	{
		height = a;
		width = b;
		depth = c;
	}
	int volume() {
		int v = height * width * depth;
		return v;
		}
	public static void main(String[] args) {
	Box B = new Box(8,9,7);
	System.out.println("The volume of the box is " + B.volume());
	}
}
