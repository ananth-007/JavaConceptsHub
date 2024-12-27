interface Lambda{
    void add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args){
        Lambda obj = (int a, int b) -> System.out.println(a+b);
        obj.add(4,5);
    }
}

