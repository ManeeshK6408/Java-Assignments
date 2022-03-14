package fibo;
import java.io.*;
import java.util.*;
class Fibo
{
	static int n=0;
	static int n1=1;
	static int n2=0;
	static void Fibo1(int count)
	{
		if(count>0)
		{
			n2=n+n1;
			n=n1;
			n1=n2;
			System.out.print(" "+n2);
			Fibo1(count-1);
		}
	}
}
public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1 = 10;
		Fibo f = new Fibo();
		int n=0,n1=1;
		System.out.print(n+" "+n1);
		Fibo.Fibo1(count1-2);

	}

}
