import java.util.*;
class Sample
{
    Scanner in = new Scanner(System.in);
    void calc()
    {
        int a,b,c,c1,c2,c3,c4;
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        c1=a-b;
        c2=a*b;
        c3=a/b;
        c4=a%b;
        System.out.print("The result of addition is "+c+"\nThe result of subtraction "+c1+"\nThe result of multiplication and division is "+c2+" , "+c3+" respectively, and modulo is "+c4);
//        infix and postfix operators
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
//        relational operators
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
//        logical operators
        System.out.println((a>b)&&(b>a));
        System.out.println((a<b)||(b>a));
        System.out.println((a>b)!=(b>a));
    }
}
public class Operator
{
    public static void main(String[] args) {
        Sample s = new Sample();
        s.calc();
    }
}