public class Methods {
    public static void main(String[] args)
    {
//        //Pre-defined methods
//        String name = "Ananth";
//        String name1 = "Ananth";
//        int a=4;
//        int num = 25;
//        System.out.println("Length of name: "+name.length());
//        System.out.println(name.equals(name1));
//        System.out.println(name.compareTo(name1));
//        System.out.println(Math.sqrt(num));
//        System.out.println(Math.min(a,num));
//        System.out.println(Math.max(a,num));
//        System.out.println();
        //User-defined methods
        demo obj = new demo();
        System.out.println("Addition: "+obj.add(4,5));
        System.out.println("Subtraction: "+obj.sub(4,5));
        System.out.println("Multiplication: "+obj.mul(4,5));
        System.out.println("Division: "+obj.div(4,5));
        System.out.println("Modulus: "+obj.mod(4,5));
        obj.greet();

    }

}
class demo
{
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a-b;
    }
    public int mul(int a,int b) {
        return a*b;
    }
    public int div(int a,int b) {
        return a/b;
    }
    public int mod(int a,int b) {
        return a%b;
    }
    public void greet()
    {
        System.out.println("Hi");
    }
}

