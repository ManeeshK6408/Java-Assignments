class All
{
    void data()
    {
        int a = 20;
        double d = 34.50;
        char c = 'A';
        String name="Maneesh K";
        float pi = 3.14f;
        boolean istrue = true;
        System.out.println(a+" "+d+" "+c+" "+istrue+" "+pi+" "+name);
    }
}
public class Datatype
{
    public static void main(String args[])
    {
        All a = new All();
        a.data();
    }
}