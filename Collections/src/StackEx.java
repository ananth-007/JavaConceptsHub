import java.util.Stack;

public class StackEx {
    public static void main(String[] args){
        Stack<Integer> num = new Stack<>();
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(1);

        System.out.println(num);
        num.pop();
        System.out.println(num);
        num.push(15);
        System.out.println(num);

        System.out.println(num.peek());
        num.add(1);
        System.out.println(num);
        System.out.println(num.get(0));
        num.clear();
        System.out.println(num);


    }
}
