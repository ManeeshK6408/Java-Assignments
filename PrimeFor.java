import java.util.*;
public class PrimeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number\n");
		int num1 = in.nextInt();
		int ind,count=0;
		for(ind=1;ind<=num1;ind++)
		{
			if(num1%ind==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
	}

}
