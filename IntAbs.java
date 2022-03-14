import java.io.*;

// A simple interface
interface In1 {
	
	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
}

// A class that implements the interface.
class IntAbs implements In1 {
	
	// Implementing the capabilities of
	// interface.
	public void display(){
	System.out.println("Implementation");
	}

	// Driver Code
	public static void main(String[] args)
	{
		IntAbs t = new IntAbs();
		t.display();
		System.out.println(a);
	}
}
