// Question 9
// Program to find the largest of 10 numbers
import java.io.*;
import java.util.*;

public class Largeof10 {
    public static void main(String[] args) {
        int large;
        int[] arr1 = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            arr1[i] = in.nextInt();
        }
        large = arr1[0];
        for (int i = 1; i < 10; i++) {
            if (large < arr1[i]) {
                large = arr1[i];
            }
        }
        System.out.println("The largest number is " + large);
    }
}