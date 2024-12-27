interface L
{
    default void display()
    {
        System.out.println("Interface L");
    }
}
interface M extends L
{
    default void display()
    {
        System.out.println("Interface M");
    }
}
interface N extends L
{
    default void display()
    {
        System.out.println("Interface N");
    }
}

class O implements M,N
{
    @Override
    public void display()
    {
        M.super.display();
        N.super.display();
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        O obj = new O();
        obj.display();
    }
}
