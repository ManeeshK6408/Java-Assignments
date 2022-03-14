import java.util.Scanner;
class SmallAndLarge{
public static void main (String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the first number: ");
int num1=scan.nextInt();//get input from user for num1
System.out.print("Enter the second number: ");
int num2=scan.nextInt();//get input from user for num2
System.out.print("Enter the third number: ");
int num3=scan.nextInt();//get input from user for num3
if(num1<=num2 && num1<=num3){
    System.out.println("\n The Smallest number is: "+num1);
}
else if(num2<=num1 && num2<=num3){
    System.out.println("\n The Smallest number is: "+num2);
}
else{
    System.out.println("\n The Smallest number is: "+num3);
}
if(num1>=num2 && num1>=num3){
    System.out.println("\n The Smallest number is: "+num1);
}
else if(num2>=num1 && num2>=num3){
    System.out.println("\n The Smallest number is: "+num2);
}
else{
    System.out.println("\n The largest number is: "+num3);
}
}
}