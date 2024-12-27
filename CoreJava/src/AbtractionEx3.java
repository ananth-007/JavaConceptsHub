abstract class WorkDetails
{
    String name;
    int age;

    abstract void officeWork(int id, String loginHr);
    WorkDetails(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayDetails()
    {
        System.out.println("Name: "+name+" "+"Age: "+age);
    }
}

class workingDetails extends WorkDetails
{
    workingDetails(String name, int age)
    {
        super(name,age);
    }
    @Override
    void officeWork(int id, String loginHr)
    {
        System.out.println("Id: "+id+" "+"Login Hr: "+loginHr);
    }

    public void personalWorkingDetails(int readingHrs, int sleepingHrs)
    {
        System.out.println("Reading hrs: "+readingHrs+" "+"Sleeping hrs: "+sleepingHrs);
    }
}

public class AbtractionEx3 {
    public static void main(String[] args)
    {
        workingDetails obj = new workingDetails("Ananth",22);
        obj.displayDetails();
        obj.officeWork(3008,"09:00");
        obj.personalWorkingDetails(6,8);

    }
}
