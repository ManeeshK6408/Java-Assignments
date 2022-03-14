import java.io.*;
import java.util.*;
class Fact
{
	public static long Fact1(int number)
	{
		long fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		long result=0;
		Scanner in = new Scanner(System.in);
		Fact f = new Fact();
		System.out.println("Enter integer");
		number=in.nextInt();
		result = Fact.Fact1(number);
		System.out.println("Factorial of a number is "+result);
		in.close();
	}

}
