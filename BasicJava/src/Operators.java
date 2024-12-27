import java.util.Arrays;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic operator
        int a=10;
        int b=20;
        System.out.println("Addition; "+ (a+b));
        System.out.println("Subtraction; "+ (a-b));
        System.out.println("Division; "+ (b/a));
        System.out.println("Multiplication; "+ (a*b));
        System.out.println("Modulus; "+ (b%a));

        // Relational operator
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical operator
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment operator
        int ab = 4;
        System.out.println("ab += 5: " + (ab+=5));
        System.out.println("ab -= 5: " + (ab-=5));
        System.out.println("ab *= 5: " + (ab*=5));
        System.out.println("ab /= 5: " + (ab/=5));
        System.out.println("ab %= 5: " + (ab%=5));
        System.out.println("ab <<= 5: " + (ab<<=5));
        System.out.println("ab >>= 5: " + (ab>>=5));
        System.out.println("ab ^= 5: " + (ab^=5));
        System.out.println("ab &= 5: " + (ab&=5));


        // Unary operator
        System.out.println("a++: " + a++);
        System.out.println("++a: " + ++a);
        System.out.println("a--: " + a--);
        System.out.println("--a: " + --a);
        System.out.println("!true: " + !true);

        // Bitwise operator
        int l=5; // 0101
        int m=3; // 0011
        System.out.println("l & m: " + (l & m)); //AND
        System.out.println("l | m: " + (l | m)); //OR
        System.out.println("l ^ m: " + (l ^ m)); //XOR
        System.out.println("~l: " + (~l));       //NOT
        System.out.println("l << 1: " + (l << 1)); //Left shift
        System.out.println("l >> 1: " + (l >> 1)); //Right shift

        int age=22; // 10110
        int num=88; // 1011000
        System.out.println("age & num: " + (age & num)); //AND
        System.out.println("age | num: " + (age | num)); //OR
        System.out.println("age ^ num: " + (age ^ num)); //XOR
        System.out.println("~age: " + (~age));       //NOT
        System.out.println("age << 1: " + (age << 1)); //Left shift
        System.out.println("age >> 1: " + (age >> 1)); //Right shift

        // Ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        // Type Comparison operator
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));  // true
        System.out.println("str instanceof Object: " + (str instanceof Object));  // true

        // Lambda operator
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        list.forEach((item) -> System.out.println(item));


    }
}
