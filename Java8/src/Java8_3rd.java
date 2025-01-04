import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class demo implements Consumer<Integer>{
    public void accept(Integer i){
        System.out.println(i);
    }
}

public class Java8_3rd {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> c = new demo();
        values.forEach(c);
    }
}
