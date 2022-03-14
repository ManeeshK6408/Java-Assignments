// Question 4
// 1 to 4 separated by spaces
class Sample {
    void single() {
        // number printing using println
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        System.out.println(num1 +" "+ num2 +" "+ num3 +" "+ num4);
    }

    void four() {
        // number printing using print
        System.out.print(1 + " ");
        System.out.print(2 + " ");
        System.out.print(3 + " ");
        System.out.print(4 + "\n");
    }
    void one()
    {
        // number printing using printf statement
        int num1=1,num2=2,num3=3,num4=4;
        System.out.printf("%d %d %d %d",num1,num2,num3,num4);
    }
}

public class SameLine {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.single();
        s.four();
        s.one();
    }
}