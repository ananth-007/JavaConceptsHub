import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Java8_3rdLambda {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> c = value -> System.out.println(value);
        values.forEach(c);
    }
}
