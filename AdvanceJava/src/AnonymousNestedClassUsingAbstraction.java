abstract class OuterClass2{
    void add(int a, int b){
        System.out.println("Addition: "+(a+b));
    }
    abstract void mul(int a, int b);
    abstract void div(int a, int b);
}

public class AnonymousNestedClassUsingAbstraction {
    public static void main(String[] args){
        OuterClass2 obj = new OuterClass2(){
            public void mul(int a, int b){
                System.out.println("Multiplication: "+(a*b));
            }
            public void div(int a, int b){
                System.out.println("Division: "+(a/b));
            }
        };
        obj.add(4,5);
        obj.mul(4,5);
        obj.div(4,5);
    }
}
