// Question 1
// Java application to print name
import java.util.*;
class Name
{
    Scanner in = new Scanner(System.in);
    void display()
    {
        String name;
        name  = in.nextLine();
        System.out.println("The name is "+name);
    }
}
public class DispName
{
    public static void main(String args[])
    {
        Name n = new Name();
        n.display();
    }
}