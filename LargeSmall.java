// Question 6
// Larger and Equal
import java.io.*;
import java.util.*;
public class LargeSmall
{
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers for comparing");
        x = in.nextInt();
        y = in.nextInt();
        if(x>y)
        {
            System.out.println("A is larger\n");
        }
        else if(x<y)
        {
            System.out.println("B is larger\n");
        }
        else
        {
            System.out.println("Both are equal\n");
        }
    }
}