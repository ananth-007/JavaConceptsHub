class A
{
    public void hi()
    {
        System.out.println("Hi");
    }
}
class B extends A
{
    public void hello()
    {
        System.out.println("Hello");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.hello();
        obj.hi();
    }
}