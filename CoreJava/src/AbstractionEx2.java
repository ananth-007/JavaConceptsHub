abstract class Operators
{
    abstract void add(int a, int b);
    abstract void sub(int a, int b);
    abstract void mul(int a, int b);
    abstract void div(int a, int b);

}
class Operation extends Operators
{
    void add(int a, int b)
    {
        System.out.println("Addition: "+ (a+b));
    }

    void sub(int a, int b)
    {
        System.out.println("Subtraction: "+ (a-b));
    }

    void mul(int a, int b)
    {
        System.out.println("Multiplication: "+ (a*b));
    }

    void div(int a, int b)
    {
        System.out.println("Division: "+ (a/b));
    }
}

public class AbstractionEx2 {
    public static void main(String[] args)
    {
        Operators obj = new Operation();
        obj.add(4,5);
        obj.sub(5,4);
        obj.mul(4,5);
        obj.div(5,5);
    }
}
