//Question 8
//Multiple program
import java.io.*;
import java.util.*;
public class MultipleCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        a = in.nextInt();
        b = in.nextInt();
        if(b%a==0)
        {
            System.out.println("a is a multiple of b");
        }
        else
        {
            System.out.println("a is not a multiple of b");
        }
    }
}