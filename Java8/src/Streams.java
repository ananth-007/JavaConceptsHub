import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(1,2,3,4,5);
        List<Integer> s = values.stream().filter(n-> n%2==0).map(n-> n*n).collect(Collectors.toList());
        System.out.println(s);
        int sumOfSquares = values.stream().filter(n-> n%2==0).map(n-> n*n).reduce(0,(a,b)->a+b);
        System.out.println(sumOfSquares);

        Predicate<Integer> p = new Predicate<Integer>(){
          public boolean test(Integer i){
              return i%2==0;
          }
        };
        Function<Integer,Integer> f = new Function<Integer,Integer>(){
            public Integer apply(Integer i){
                return i*2;
            }
        };
        BinaryOperator<Integer> b = new BinaryOperator<Integer>(){
            public Integer apply(Integer i, Integer j){
                return i+j;
            }
        };

        Stream<Integer> s1 = values.stream();
        Stream<Integer> s2 = s1.filter(p);
        Stream<Integer> s3 = s2.map(f);
        int result = s3.reduce(0,b);
        System.out.println(result);
    }
}
