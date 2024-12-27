class OuterClass{
    public void add(){
        System.out.println("Addition");
    }
    class InnerClass{
        public void sub(){
            System.out.println("Subtraction");
        }
    }
}

public class NonStaticNestedClass {
    public static void main(String[] args)
    {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass obj1 = obj.new InnerClass();
        obj.add();
        obj1.sub();
    }
}
