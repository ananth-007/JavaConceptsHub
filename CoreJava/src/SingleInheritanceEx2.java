class Car
{
    Car(String color, int noOfWheels)
    {
        System.out.println("----Car----");
        System.out.println(color+" "+noOfWheels);
    }
    public void details1(int price,String fuelType)
    {
        System.out.println("----Car details1----");
        System.out.println(price+" "+fuelType);
    }
}
class BMW extends Car
{
    BMW(int price,String color)
    {
        super("White",4);
        System.out.println("----BMW----");
        System.out.println(price+" "+color);
    }
    public void details2(String model, String color)
    {
        System.out.println("----BMW details2----");
        System.out.println(model+" "+color);
    }
}

public class SingleInheritanceEx2 {
    public static void main(String[] args)
    {
        BMW obj = new BMW(5000000,"Black");
        obj.details1(2500000,"Petrol");
        obj.details2("BMW M1","White");
    }
}
