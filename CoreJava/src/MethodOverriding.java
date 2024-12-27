class Parents
{
    void mobile()
    {
        System.out.println("Samsung");
    }
}
class Child extends Parents
{
    @Override
    void mobile()
    {
        System.out.println("Oppo");
    }
}

public class MethodOverriding {
    public static void main(String[] args)
    {
        Parents obj = new Child();
        obj.mobile();
    }
}
