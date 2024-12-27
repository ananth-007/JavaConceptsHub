class Food
{
    void details(String typeOfFood, String name, int rating)
    {
        System.out.println(typeOfFood+" "+name+" "+rating);
    }
}
class F1 extends Food
{
    void f1Details(String name, int price, int quantity)
    {
        System.out.println(name+" "+price+" "+quantity);
    }
}
class F2 extends Food
{
    void f2Details(String name, int price, int quantity)
    {
        System.out.println(name+" "+price+" "+quantity);
    }
}

public class HierarchialInheritanceEx1 {
    public static void main(String[] args)
    {
        F1 obj = new F1();
        obj.details("Meal","Chapati",5);
        obj.f1Details("Biryani",120,2);
        F2 obj2 = new F2();
        obj2.details("Meal","Chapati",5);
        obj2.f2Details("Kebab",120,2);

    }
}
