
public class SumRange {
	public static void main(String args[]) {
		int number1 = 10;
		int number2 = 20;
		int sum = 0;
		for (int ind = number1; ind <= number2; ind += 1) {
			sum = sum + ind;
		}
		System.out.println("The sum is " + sum);
	}
}
