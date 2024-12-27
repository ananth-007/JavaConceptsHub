class Parent
{
    void p()
    {
        System.out.println("Parent");
    }
}
class ChildA extends Parent
{
    void c1()
    {
        System.out.println("Child A");
    }
}
class ChildB extends Parent
{
    void c2()
    {
        System.out.println("Child B");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args)
    {
        ChildA obj2 = new ChildA();
        obj2.p();
        obj2.c1();
        ChildB obj = new ChildB();
        obj.p();
        obj.c2();


    }
}
