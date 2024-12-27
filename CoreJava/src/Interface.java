interface Animal1
{
    int a=5;
    int b=4;
    void eat();
    void travel();
}
class Dog1 implements Animal1
{
    @Override
    public void eat()
    {
        System.out.println("Dog is eating");
    }

    @Override
    public void travel()
    {
        System.out.println("Dog is travelling");
    }
}

public class Interface {
    public static void main(String[] args)
    {
        Dog1  obj = new Dog1();
        obj.eat();
        obj.travel();
        System.out.println(Animal1.a+" "+Animal1.b);
    }
}
