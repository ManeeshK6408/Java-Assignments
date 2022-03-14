// Question 15
// Employee details with 10 percent hike
import java.io.*;
import java.util.*;

class Employee {
    String firstName, lastName;
    private double monthlySalary;

    public Employee(String fName, String lName, double salary) {
        this.firstName = fName;
        this.lastName = lName;
        this.monthlySalary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return monthlySalary;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public void setSalary(double monthlySalary)
    {
        this.monthlySalary=monthlySalary;
    }
}

public class EmployeeTest {
    public void display(Employee e)
    {
        System.out.println("The yearly salary of "+e.getFirstName()+" "+e.getLastName()+" is:\t"+e.getSalary()*12);
    }
    public void setRaise(Employee e)
    {
        e.setSalary(e.getSalary()*1.1);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Maneesh","K",1000);
        Employee e2 = new Employee("Akash","N",1000);
        EmployeeTest et = new EmployeeTest();
        et.display(e1);
        et.display(e2);
        et.setRaise(e1);
        et.setRaise(e2);
        et.display(e1);
        et.display(e2);
    }
}