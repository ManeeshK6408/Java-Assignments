// Question 9
// To find the volume of sphere
import java.util.*;
import java.io.*;
class Sphere
{
    double sphereVolume(double radius)
    {
        double volume = (4/3)*(22/7)*(radius*radius*radius);
        return volume;
    }
}
public class VolOfSph {
    public static void main(String[] args) {
        double radius,volume;
        Scanner in = new Scanner(System.in);
        Sphere s = new Sphere();
        System.out.println("Enter the radius of sphere:");
        radius=in.nextDouble();
        System.out.println("The volume is "+s.sphereVolume(radius));
    }
}