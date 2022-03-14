import java.io.*;
interface InterfaceEx
{
	final int a = 20,b = 10;
	void addition();
	void sub();
}
public class IntExample implements InterfaceEx{
	public void addition()
	{
		System.out.println("The sum using interface addition is "+(a+b));
	}
	public void sub()
	{
		System.out.println("The subtraction using interface subtraction is "+(a-b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntExample ie = new IntExample();
		ie.addition();
		ie.sub();
	}

}
