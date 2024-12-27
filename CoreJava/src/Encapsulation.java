class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if(age>0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Age must be positive.");
        }
    }

    public void displayDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Person obj = new Person("Ananth",22);
        obj.displayDetails();
        obj.setName("Uday");
        obj.setAge(11);
        System.out.println();
        System.out.println("After updating");
        obj.displayDetails();
        System.out.println();
        obj.setAge(-11);
    }
}
