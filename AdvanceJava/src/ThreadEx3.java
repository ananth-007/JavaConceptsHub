class A1 implements Runnable{
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println("Hii: "+i);
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        }
    }
}
class A2 implements Runnable{
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println("Hello: "+i);
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        }
    }
}

public class ThreadEx3 {
    public static void main(String[] args)
    {
        Runnable obj = new A1();
        Runnable obj1 = new A2();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }
}
