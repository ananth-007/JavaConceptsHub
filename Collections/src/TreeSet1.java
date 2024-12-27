import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;


public class TreeSet1 {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(15);
        num.add(7);
        num.add(9);
        System.out.println(num);

        Set<String> names = new TreeSet<>();
        names.add("Rahul");
        names.add("Lakshmi");
        names.add("Arun");
        names.add("Ananth");
        System.out.println(names);

        List<Integer> index = new ArrayList<>(num);
        System.out.println(index.indexOf(15));

        Set<String> name = new LinkedHashSet<>();
        name.add("Rahul");
        name.add("Lakshmi");
        name.add("Arun");
        name.add("Ananth");
        System.out.println(name);


    }
}