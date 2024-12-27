interface Head
{
    void eat();
}
class Node1 implements Head
{
    public void eat()
    {
        System.out.println("Node1 is eating");
    }
}
class Node2 implements Head
{
    public void eat()
    {
        System.out.println("Node2 is eating");
    }
}

public class HierarchialInterface {
    public static void main(String[] args)
    {
        Node1 obj = new Node1();
        obj.eat();
        Node2 obj2 = new Node2();
        obj2.eat();
    }
}
