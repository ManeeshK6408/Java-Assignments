// Question 2
// Printing product of two numbers
import java.util.Scanner;

class ProdInt {
    Scanner in = new Scanner(System.in);

    int calc(int a, int b, int c) {
        return (a * b * c);
    }
}

public class Prod {
    public static void main(String[] args) {
        ProdInt p = new ProdInt();
        int x, y, z;
        double a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 numbers to be multiplied");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        a = p.calc(x, y, z);
        System.out.println("The result of multiplication is "+a);
    }
}