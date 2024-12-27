class Animal
{
    void details1(String color,String typeOfFood){
        System.out.println(color+" "+typeOfFood);
    }
}
class Doggy extends Animal
{
    void details2(String name,String breed,String color){
        System.out.println(name+" "+breed+" "+color);
    }
}
class Puppy extends Doggy
{
    void details3(String name,String breed,String color,String gender){
        System.out.println(name+" "+breed+" "+color+" "+gender);
    }
}

public class MultilevelInheritanceEx1 {
    public static void main(String[] args)
    {
        Puppy obj = new Puppy();
        obj.details1("Brown","Bone");
        obj.details2("Danny","GermanShephard","Brown");
        obj.details3("Munna","PitBull","Black","Male");
    }
}
