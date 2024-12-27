public class Constructors {
    int a=4;
    int b=3;
    public static void main(String[] args)
    {
        //default constructor
        Constructors ctr = new Constructors();//default constructor invokes here.
        System.out.println(ctr.a);
        System.out.println(ctr.b);
        constr obj = new constr();
        constr obj1 = new constr(4,5);
    }
}
class constr
{
    //No-args constructor
    constr()
    {
        System.out.println("Hello World!");
    }

    //Parameterized constructor
    constr(int a, int b)
    {
        int sum=a+b;
        System.out.println("sum: "+sum);
    }



}
