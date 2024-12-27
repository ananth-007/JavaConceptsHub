interface Swimmer
{
    void swims();
}
interface Flyer
{
    void flys();
}
class Duck implements Swimmer,Flyer
{
    public void swims()
    {
        System.out.println("Duck is swimming");
    }
    public void flys()
    {
        System.out.println("Duck is flying");
    }
}

public class MultipleInheritanceEx1 {
    public static void main(String[] args)
    {
        Duck obj = new Duck();
        obj.swims();
        obj.flys();
    }
}
