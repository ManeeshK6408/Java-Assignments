class Animal
{
	String color = "Black";
	void display()
	{
		System.out.println("I am an animal");
	}
}
class Cat extends Animal
{
	String color = "White";
	void display1()
	{
		System.out.println("I am a Cat");
		System.out.println(super.color);
	}
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		System.out.println(c.color);
		c.display1();

	}

}
