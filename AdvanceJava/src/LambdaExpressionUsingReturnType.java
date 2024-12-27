interface Lambda1{
    int add(int a, int b);
}

public class LambdaExpressionUsingReturnType {
    public static void main(String[] args){
        Lambda1 obj = (a,b) -> (a+b);
        int res = obj.add(4,5);
        System.out.println("Addition: "+res);
    }
}
