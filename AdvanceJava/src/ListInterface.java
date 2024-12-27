import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Vector;

public class ListInterface {
    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("Ananth");
        myList.add("Bengaluru");
        myList.add("Biryani");
        myList.add("India");
        myList.add("007");
        myList.add("22");
        myList.add("India");
        myList.add("Upma");
        System.out.println("Before removing: "+myList);
        myList.remove("India");
        myList.remove("Upma");
        myList.addLast("Chapati");
        myList.add("Tea");
        System.out.println("After removing: "+myList);
        System.out.println();

        List<String> myList1 = new LinkedList<>();
        myList1.add("Aquaman");
        myList1.addFirst("Jalgara");
        System.out.println(myList1);
        System.out.println();

        List<String> myList2 = new Vector<>();
        myList2.add("Darshan");
        myList2.add("Kranti");
        System.out.println(myList2);

    }
}
