interface GrandParent1
{
    void grand();
}
interface Parent1 extends GrandParent1
{
    void parent();
}
class Child1 implements Parent1
{
    public void grand()
    {
        System.out.println("Grand father");
    }
    public void parent()
    {
        System.out.println("father");
    }
    public void child()
    {
        System.out.println("Child");
    }
}

public class MultilevelInterface {
    public static void main(String[] args)
    {
        Child1 obj = new Child1();
        obj.grand();
        obj.parent();
        obj.child();
    }
}
