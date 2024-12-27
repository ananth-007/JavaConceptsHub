public class Person {
    public static void main(String[] args)
    {
        Stud obj1 = new Stud("Ananth",22);
        obj1.student("Ananth",22,"CSE");
    }

}
class Stud
{
    public void student(String name, int age, String branch)
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Branch: "+branch);
    }
    Stud(String name, int age)
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
