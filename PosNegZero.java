import java.util.*;
public class PosNegZero {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		if(number>0)
		{
			System.out.println("The number is positive");
		}
		else if(number<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
		
	}

}
