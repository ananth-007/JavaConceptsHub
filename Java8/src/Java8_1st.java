interface I{
    static void phone()
    {
        System.out.println("Phone 1");
    }
}

interface J extends I{
    default void phone(){
        System.out.println("Phone 2");
    }
}

class A implements J{
    @Override
    public void phone(){
        System.out.println("Phone 3");
        J.super.phone();        // 2nd way of calling method, for this the method should be static
        I.phone();
    }
}

public class Java8_1st{ // 1st way of fetching
    public static void main(String[] args) {
        A obj = new A();
        obj.phone();
    }
}