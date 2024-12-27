class GrandFather
{
    void hi()
    {
        System.out.println("Hi");
    }
}
class Father extends GrandFather
{
    void hello()
    {
        System.out.println("Hello");
    }
}
class Son extends Father
{
    void yoo()
    {
        System.out.println("yoooo");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args)
    {
        Son obj = new Son();
        obj.yoo();
        obj.hello();
        obj.hi();
    }
}
