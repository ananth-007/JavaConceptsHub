import java.util.List;
import java.util.LinkedList;

public class ListInterfaceUsingLinkedList {
    public static void main(String[] args){
        List<String> details = new LinkedList<>();
        details.add("Ananth");
        details.add("Kumar");
        details.add("St Mary's High School");
        details.add("Narayana PU College");
        details.add("Atria Institute of Technology");
        details.add("1AT20CS007");
        System.out.println(details);
        details.set(4,"Bengaluru");
        details.remove(2);
        System.out.println(details);
    }
}
