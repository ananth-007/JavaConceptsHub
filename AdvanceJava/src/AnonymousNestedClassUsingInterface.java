interface OuterClass1{
    default void add(int a, int b){
        System.out.println("Addition: "+(a+b));
    }
    void mul(int a, int b);
    void div(int a, int b);
}

public class AnonymousNestedClassUsingInterface {
    public static void main(String[] args){
        OuterClass1 obj = new OuterClass1(){
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
