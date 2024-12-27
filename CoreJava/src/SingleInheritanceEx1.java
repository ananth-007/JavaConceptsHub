class dog
{
    public void details(String name, String color, String breed)
    {
        System.out.println(name+" "+color+" "+breed);
    }
}
class babydog extends dog
{
    public void details2(String name, String color, String breed, String gender)
    {
        System.out.println(name+" "+color+" "+breed+" "+gender);
    }
}

public class SingleInheritanceEx1 {
    public static void main(String[] args)
    {
        babydog obj = new babydog();
        obj.details("Munna","Brown","German Shephard");
        obj.details2("Danny","Brown","German Shephard","Male");
    }
}
