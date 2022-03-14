package pack2;

//Java program to showcase the example
//of protected access modifier
//import required packages
import java.io.*;
import java.util.*;

//declaring a parent class A
class A {
	
	// declaring a protected method m1()
	protected void m1() { System.out.println("GFG"); }
}

//creating a child class by extending the class A
public class B1 extends A {
	
	// main method
	public static void main(String[] args)
	{
		// creating an object of parent class
		// using parent reference
		A a = new A();
		
		/// calling method m1
		a.m1();
		
		// creating an object of child class
		// using child reference
		B1 b = new B1();
		
		// calling method m1
		b.m1();
		
		// creating an object of child class
		// using parent reference
		A a1 = new B1();
		
		// calling m1 method
		a1.m1();
	}
}
