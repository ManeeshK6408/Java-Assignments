// Question 3
// To convert fahrenheit to celsius
import java.util.Scanner;

class Converter {
    double FtoC(double degree) {
        double celsius = (5/9)*(degree-32);
        return celsius;
    }

    double CtoF(double degree) {
        double fahren = (degree*1.8)+32;
        return fahren;
    }
}

public class TempConv {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double degree1;
        int choice;
        Converter c = new Converter();
        degree1 = in.nextDouble();
        System.out.println("1. Celsius\t2.FahrenHeit\tEnter your choice\n");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                c.FtoC(degree1);
                break;
            case 2:
                c.CtoF(degree1);
                break;
            default:
                System.out.println("The choice is incorrect! Please try again!!");
                break;
        }
    }
}