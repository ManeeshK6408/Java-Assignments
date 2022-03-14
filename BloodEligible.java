import java.util.*;
public class BloodEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int weight,age;
		System.out.println("Enter the age and weight");
		age = in.nextInt();
		weight = in.nextInt();
		if(age>18 && age<=60)
		{
			System.out.println("You are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		if(weight>45)
		{
			System.out.println("Your weight is eligible");
		}
		else
		{
			System.out.println("Your weight is not eligible");
		}
	}

}
