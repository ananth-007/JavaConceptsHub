interface Animals
{
    void walk();
}
interface Dogs
{
    void run();
}

class Danny implements Animals, Dogs
{
    @Override
    public void walk()
    {
        System.out.println("The dog is walking");
    }

    @Override
    public void run()
    {
        System.out.println("The dog is running");
    }
}

public class MultipleInheritance {
    public static void main(String[] args)
    {
        Danny obj = new Danny();
        obj.walk();
        obj.run();
    }
}
