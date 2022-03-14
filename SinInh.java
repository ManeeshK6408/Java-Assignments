class Class1
{
	int class1 = 10;
	String name = "Maneesh K";
}
public class SinInh extends Class1{
	static double marks = 98.16;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 c = new Class1();
		int p = c.class1;
		String g =c.name;
		double f = marks;
		System.out.print("The class is "+p+"\nName is "+g+"\nMarks is "+f);
	}

}
