import java.util.Collection;
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args){
        Collection<String> names = new ArrayList<String>();
        names.add("Ananth");
        names.add("Uday");
        names.add("Abhi");
        names.add("Charlie");
        names.remove("Abhi");
        System.out.println("Names: "+names);
    }
}
