//abstract class
abstract class Vehicless
{
    String brand;
    //abstract method
    abstract void start();

    //constructor
    Vehicless(String brand)
    {
        this.brand = brand;
    }

    //Concrete method
    public void displayBrand()
    {
        System.out.println("Brand: "+brand);
    }
}

class Carss extends Vehicless
{
    Carss(String brand)
    {
        super(brand);
    }

    @Override
    void start()
    {
        System.out.println("Car starts with a button");
    }
}
class Bikess extends Vehicless
{
    Bikess(String brand)
    {
        super(brand);
    }

    @Override
    void start()
    {
        System.out.println("Bike starts with a key");
    }
}

public class AbstractionEx1 {
    public static void main(String[] args)
    {
        Carss obj = new Carss("BMW");
        obj.displayBrand();
        obj.start();
        Bikess obj2 = new Bikess("Royal Enfield");
        obj2.displayBrand();
        obj2.start();
    }
}
