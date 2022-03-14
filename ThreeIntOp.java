// Question 7
// sum, average, product,largest and smallest program
import java.io.*;
import java.util.*;
public class ThreeIntOp {
    public static void main(String[] args) {
        int x,y,z,sum,product,average,smallest,largest;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the following 3 numbers\nEnter number 1: ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        sum = x+y+z;
        average = (x+y+z)/3;
        product = x*y*z;
        if(x>y && x>z)
        {
            System.out.println("x is largest");
        }
        else if(y>x && y>z)
        {
            System.out.println("y is largest");
        }
        else
        {
            System.out.println("z is largest");
        }
        if(x<y && x<z)
        {
            System.out.println("x is less");
        }
        else if(y<x && y<z)
        {
            System.out.println("y is less");
        }
        else
        {
            System.out.println("z is less");
        }
    }
}