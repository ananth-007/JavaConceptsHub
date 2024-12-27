public class Students {
    public static void main(String[] args)
    {
        Details obj = new Details();
        obj.s1("Ananth",22,"CSE");
        obj.s2("Kumar",21,"ECE",007);
        obj.t1("Manjunath",26);
    }
}
class Details
{
    public void s1(String name, int age, String branch)
    {
        System.out.println("S1 Name: "+name);
        System.out.println("S1 age: "+age);
        System.out.println("S1 branch: "+branch);
        System.out.println();
    }

    public void s2(String name, int age, String branch, int rollNo)
    {
        System.out.println("S2 Name: "+name);
        System.out.println("S2 age: "+age);
        System.out.println("S2 branch: "+branch);
        System.out.println("S2 roll no: "+rollNo);
        System.out.println();
    }

    public void t1(String name, int age)
    {
        System.out.println("T1 Name: "+name);
        System.out.println("T1 age: "+age);
        System.out.println();
    }


}
