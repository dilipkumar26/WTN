/*Create a class named ‘Animal’ which includes methods like eat() and sleep(). 
 * Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly(). 
 * Create an instance of Animal class and invoke the eat and sleep methods using this object.
 * Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/

package com.wipro.Inheritance;
class Animal{
	public void eat() {
		System.out.println("Eating");
	}
	public void sleep()
	{
		System.out.println("Sleep");
	}
}
 class Bird extends Animal{
	 public void fly() {
		 System.out.println("Flying");
	 }
 }

public class AnimalBirdDetails {
	public static void main(String args[]) {
		Animal A1=new Animal();
		A1.eat();
		A1.sleep();
		Bird B1=new Bird();
		B1.eat();
		B1.sleep();
		B1.fly();
	}

}
