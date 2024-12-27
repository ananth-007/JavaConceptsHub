interface Lambda3{
    int mul(int a, int b, int c);
}

public class LambdaExpressionEx2 {
    public static void main(String[] args){
        Lambda3 obj = (a,b,c) -> (a*b*c);
        int res = obj.mul(3,3,3);
        System.out.println("Multiplication: "+res);
    }
}
