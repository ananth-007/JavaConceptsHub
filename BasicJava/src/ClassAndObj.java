public class ClassAndObj {
    public static void main(String[] args)
    {
        Dog danny = new Dog();
        Cat obj1 = new Cat();
        Car supra = new Car();
        Bike himalaya = new Bike();
        Mobile oppo = new Mobile();

        System.out.println("---Dog----");
        System.out.println(danny.name);
        System.out.println(danny.age);
        System.out.println(danny.color);
        System.out.println();
        System.out.println("---Cat----");
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.color);
        System.out.println();
        System.out.println("---Car----");
        System.out.println(supra.name);
        System.out.println(supra.color);
        System.out.println(supra.price);
        System.out.println(supra.fuelType);
        System.out.println();
        System.out.println("---Bike----");
        System.out.println(himalaya.name);
        System.out.println(himalaya.color);
        System.out.println(himalaya.price);
        System.out.println(himalaya.fuelType);
        System.out.println(himalaya.cc);
        System.out.println();
        System.out.println("---Mobile----");
        System.out.println(oppo.name);
        System.out.println(oppo.color);
        System.out.println(oppo.processsor);
        System.out.println(oppo.RAM);
        System.out.println(oppo.ROM);
        System.out.println(oppo.price);
        System.out.println();

    }


}
class Dog
{

    String name = "German shephard";
    int age= 5;
    String color = "Brown";

}
class Cat
{
    String name = "Munni";
    int age= 1;
    String color = "White";
}

class Car
{
    String name = "Supra MK4";
    String color = "Orange";
    int price = 8500000;
    String fuelType ="Petrol";
}

class Bike
{
    String name = "Himalayan RE";
    String color = "Kamet White";
    int price = 350000;
    String fuelType ="Petrol";
    int cc = 450;
}

class Mobile
{
    String name= "Oppo F17";
    String color="White";
    String processsor = "Snapdragon";
    String RAM = "8GB";
    String ROM = "128GB";
    int price = 20000;
}


