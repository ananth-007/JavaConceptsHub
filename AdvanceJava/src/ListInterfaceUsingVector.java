import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Collections;


public class ListInterfaceUsingVector {
    public static void main(String[] args){
        List<Integer> obj = new Vector<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        System.out.println(obj);
        obj.remove(2);
        System.out.println(obj);
        obj.add(3,60);
        System.out.println(obj);
        obj.add(70);
        System.out.println(obj);
        obj.remove(1);
        System.out.println(obj);
        obj.remove(3);
        System.out.println(obj);
        obj.add(5);
        System.out.println(obj);
        Collections.sort(obj);
        System.out.println(obj);

    }
}
