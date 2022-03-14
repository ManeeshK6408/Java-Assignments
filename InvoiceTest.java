// Question 14
// Invoice using constructor and methods (parameterized constructor)
import java.io.*;
import java.util.*;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String pNum, String pDes, int qty, double pr) {
        if (pNum != null) {
            partNumber = pNum;
        } else {
            partNumber = "0";
        }
        if (pDes != null) {
            partDescription = pDes;
        } else {
            partDescription = "0";
        }
        if(qty>0)
        {
            quantity=qty;
        }
        else
        {
            quantity=0;
        }
        if(pr>0.0)
        {
            price=pr;
        }
        else
        {
            price=0.0;
        }
    }
    public String getPartNum()
    {
        return partNumber;
    }
    public String getPartDes()
    {
        return partDescription;
    }
    public int getqty()
    {
        return quantity;
    }
    public double getprice()
    {
        return price;
    }
    public void setpartNum(String pNum)
    {
        if(pNum!=null)
        {
            partNumber=pNum;
        }
        else
        {
            partNumber = "0";
        }
    }
    public void setpartDes(String pDes)
    {
        if(pDes!=null)
        {
            partDescription=pDes;
        }
        else
        {
            partDescription = "0";
        }
    }
    public void setQuantity(int qty)
    {
        if(qty>0)
        {
            quantity=qty;
        }
        else
        {
            quantity = 0;
        }
    }
    public void setPrice(double pr)
    {
        if(pr>0.0)
        {
            pr=price;
        }
        else
        {
            price=0.0;
        }
    }
    public double invoiceAmt()
    {
        return (double)quantity*price;
    }
}

public class InvoiceTest {
    public static void main(String args[]) {
        Invoice in1 = new Invoice("A3287","JavaScript",800,250.0);
        Invoice in2 = new Invoice("A6754","HTML and CSS",1000,340.0);
        System.out.printf("%s\t%s\t%d\t%.2f\n",in1.getPartNum(),in1.getPartDes(),in1.getqty(),in1.getprice());
        System.out.printf("%s\t%s\t%d\t%.2f\n",in2.getPartNum(),in2.getPartDes(),in2.getqty(),in2.getprice());
    }
}