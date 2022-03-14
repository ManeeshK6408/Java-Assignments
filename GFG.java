package pack2;

//Java Program to illustrate Package Level Access Modifier

//Importing utility classes
//Importing input output classes
import java.io.*;
import java.util.*;

//Main Class
public class GFG {

	// Declaring default variables that is
	// having no access modifier
	String s = "Geeksfor";
	String s1 = "Geeks";

	// Method 1
	// To declare a default method
	String fullName()
	{

		// Concatenation of strings
		return s + s1;
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Creating an object of main class(GFG)
		// in the main() method
		GFG g = new GFG();

		// Calling method1 using class instance
		// and printing the concatenation of strings
		System.out.println(g.fullName());
	}
}
