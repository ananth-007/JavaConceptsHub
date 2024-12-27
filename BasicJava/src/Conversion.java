public class Conversion {
    public static void main(String[] args) {
        // Implicit Conversion
        int a = 10;
        long b = a;
        System.out.println("int to long: "+b);

        // Explicit Conversion
        long c = 10000L;
        int d = (int) c;
        System.out.println("long to int: "+d);

        float la = 1000.34f;
        int ab = (int) la;
        System.out.println("float to int: "+ab);

        // String Conversion
        String e = "123";
        int f = Integer.parseInt(e);
        System.out.println("String to int: "+f);// String to int

        int g = 456;
        String h = String.valueOf(g);
        System.out.println("int to String: "+h);// int to String

        // Type promotion
        byte i = 10;
        byte j = 10;
        int k = i+j;//promoted to int
        System.out.println("Promoted to int: "+k);

        //Wrapper class
        int l = 10;
        Integer m = l;//boxed
        int n = m;//unboxed
        System.out.println("Boxed wrapper: "+m);
        System.out.println("Unboxed wrapper: "+n);

    }
}
