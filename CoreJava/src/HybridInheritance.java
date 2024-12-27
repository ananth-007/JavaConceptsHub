class Vehicles
{
    void drive()
    {
        System.out.println("The vehicle is driving");
    }
}

interface Electric
{
    void charge();
}
interface Autonomous
{
    void selfDrive();
}

class ElectricCar extends Vehicles implements Electric, Autonomous
{
    @Override
    public void charge()
    {
        System.out.println("The vehicle is charging");
    }

    @Override
    public void selfDrive()
    {
        System.out.println("The vehicle is self-driving");
    }
}

public class HybridInheritance {
    public static void main(String[] args)
    {
        ElectricCar obj = new ElectricCar();
        obj.drive();
        obj.charge();
        obj.selfDrive();
    }
}
