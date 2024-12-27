public class Company {
    public static void main(String[] args)
    {
        Employee obj = new Employee("Ananth","Trainee",30000,"M");
        Employee obj1 = new Employee("Uday",22,"Bengaluru",2);
        obj1.h1("Sanjay",10065,"TCS");
        obj1.d1("Devops",2052,"Bengaluru");

//        obj.empDetails("Ananth",007,30000,"Trainee");
//        obj.depDetails("Devops",1001,30,8867535400L);
    }
}

class Employee
{
//    public void empDetails(String E_Name, int E_Id, int E_Salary, String E_role)
//    {
//        System.out.println("Emp name: "+E_Name+" Emp Id: "+E_Id+" Emp Salary: "+E_Salary+" Emp role: "+E_role);
//    }
//    public void depDetails(String D_Name, int D_Id, int NoOf_Emp, long Dep_phone)
//    {
//        System.out.println("Dep name: "+D_Name+" Dep Id: "+D_Id+" No of employees: "+NoOf_Emp+" Dep phone: "+Dep_phone);
//    }
    Employee(String name, String role, int salary, String gender)
    {
        System.out.println(name+" "+role+" "+salary+" "+gender);
    }
    Employee(String name, int age,String location, int experience)
    {
        System.out.println(name+" "+age+" "+location+" "+experience);
    }
    public void h1(String name, int id, String company_name)
    {
        System.out.println(name+" "+id+" "+company_name);
    }
    public void d1(String dep_name, int d_id,String location)
    {
        System.out.println(dep_name+" "+d_id+" "+location);
    }
}
