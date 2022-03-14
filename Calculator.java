// Question 5
// sum, product, difference and quotient
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers to perform sum, difference, product and division on");
        x = in.nextInt();
        y = in.nextInt();
        System.out.print("The sum is " + (x + y) + "\nThe difference is " + (x - y) + "\nThe product is " + (x * y)
                + "\nThe division is " + (x / y) + "\nThe modulus is " + (x % y));
    }
}