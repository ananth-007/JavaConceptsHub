import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args){
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(1);
        q.offer(10);
        q.offer(111);

        q.poll();
        q.offer(120);
        System.out.println(q);

        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.offer("Hi");
        ad.offer("Good");
        ad.offer("Morning");
        ad.poll();

        ad.push("H");
        ad.push("E");
        ad.push("L");
        ad.push("L");
        ad.pop();

        System.out.println(ad);

        Queue<Integer> ql = new LinkedList<>();
        ql.add(3);
        ql.add(2);
        ql.add(1);
        System.out.println(ql);

    }
}
