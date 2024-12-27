class OutNested{
    public void person(String name, int age){
        System.out.println("Name: "+name+" | Age: "+age);
    }
    class InNested{
        public void emp(int Id, String name, int salary){
            System.out.println("Id: "+Id+" | Name: "+name+" | Salary: "+salary);
        }
        public void dep(int Id, String name){
            System.out.println("Id: "+Id+" | Name: "+name);
        }
        public void hr(String name,String location){
            System.out.println("Name: "+name+" | Location: "+location);
        }

    }
}

public class NonStaticNestedClassEx {
    public static void main(String[] args){
        OutNested obj = new OutNested();
        OutNested.InNested obj1 = obj.new InNested();
        obj.person("Ananth",22);
        obj1.emp(1007,"Rahul",45000);
        obj1.dep(2065,"Finance");
        obj1.hr("Sushil","Bengaluru");
    }
}
