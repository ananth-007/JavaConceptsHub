class Student
{
    private String s_name;
    private String s_branch;
    private String s_rollNo;
    private String s_address;
    private int s_age;

    public Student(String s_name, String s_branch, String s_rollNo, String s_address, int s_age)
    {
        this.s_name = s_name;
        this.s_branch = s_branch;
        this.s_rollNo = s_rollNo;
        this.s_address = s_address;
        this.s_age = s_age;
    }

    public String getS_name()
    {
        return s_name;
    }
    public String getS_branch()
    {
        return s_branch;
    }
    public String getS_rollNo()
    {
        return s_rollNo;
    }
    public String getS_address()
    {
        return s_address;
    }
    public int getS_age()
    {
        return s_age;
    }

    public void setS_name(String s_name)
    {
        this.s_name = s_name;
    }
    public void setS_branch(String s_branch)
    {
        this.s_branch = s_branch;
    }
    public void setS_rollNo(String s_rollNo)
    {
        this.s_rollNo = s_rollNo;
    }
    public void setS_address(String s_address)
    {
        this.s_address = s_address;
    }
    public void setS_age(int s_age)
    {
        if(s_age>0)
        {
            this.s_age = s_age;
        }
        else
        {
            System.out.println("Age must be positive.");
        }
    }

    public void displayDetails()
    {
        System.out.println("Name: "+ s_name);
        System.out.println("Branch: "+ s_branch);
        System.out.println("Roll No: "+ s_rollNo);
        System.out.println("Address: "+ s_address);
        System.out.println("Age: "+ s_age);

    }
}

public class EncapsulationStudentDetail {
    public static void main(String[] args)
    {
        Student obj = new Student("Ananth","CSE","1AT20CS007","Bengaluru",22);
        obj.displayDetails();
        System.out.println();
        System.out.println("After update");
        obj.setS_name("Uday");
        obj.setS_age(23);
        obj.setS_branch("ECE");
        obj.displayDetails();
    }
}
