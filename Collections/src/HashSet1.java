import java.util.Set;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args){
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("apple");
        System.out.println(fruits);

    }
}
