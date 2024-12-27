class Sum
{
    Sum(int a,int b)
    {
        System.out.println(a+b);
    }
    Sum(double a,double b)
    {
        System.out.println(a+b);
    }

    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void add(double a, double b)
    {
        System.out.println(a+b);
    }
}

public class MethodOverloading {
    public static void main(String[] args)
    {
        Sum obj = new Sum(4,5);
        Sum obj1 = new Sum(4.05,5.05);
        obj.add(4,5);
        obj.add(4.5,6.5);
    }
}
