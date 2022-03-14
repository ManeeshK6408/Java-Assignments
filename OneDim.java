// Question 11
// one-dimesnsional array operations
import java.io.*;
import java.util.*;

public class OneDim {
    public static void main(String[] args) {
        // Part a answer
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        // Part b answer
        int[] bonus;
        bonus = new int[15];
        for (int i = 0; i < 15; i++) {
            bonus[i] += 1;
        }
        // Part c answer
        int bestScores[] = { 10, 30, 50, 60, 90 };
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\t", bestScores[i]);
        }
    }
}