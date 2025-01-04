import java.util.Arrays;
import java.util.List;

public class Java8_2nd {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(10,20,30,40,50);
        values.forEach(i -> System.out.println(i)); // 2nd feature of Java 8:- using forEach method to fetch details
    }
}
