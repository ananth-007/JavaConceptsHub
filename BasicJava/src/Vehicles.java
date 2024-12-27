public class Vehicles {
    public static void main(String[] args)
    {
        Lorry obj = new Lorry("Deisel",20);
        Lorry obj1 = new Lorry("Orange",4000000,"R004");
        obj1.car("Supra MK4","Orange",20000000);
        obj1.bike("Himalayan","white");
    }
}
class Lorry
{
    Lorry(String fuelType,int capacity)
    {
        System.out.println(fuelType+" "+capacity);
    }
    Lorry(String color,int price, String tyreSize)
    {
        System.out.println(color+" "+price+" "+tyreSize);
    }
    public void car(String name, String color, int price)
    {
        System.out.println(name+" "+color+" "+price);
    }
    public void bike(String name, String color)
    {
        System.out.println(name+" "+color);
    }

}
