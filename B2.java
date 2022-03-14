package pack2;

//Java program to showcase the example
//of private access modifier

//import required packages
import java.io.*;

import java.util.*;

//helper class
class A2 {
	
	// helper method
	void m1() { System.out.println("GFG"); }
}

//driver class
public class B2 {
	
	// main method
	public static void main(String[] args)
	{
		// creating an object of type class A
		A2 a = new A2();
		
		// accessing the method m1()
		a.m1();
	}
}
