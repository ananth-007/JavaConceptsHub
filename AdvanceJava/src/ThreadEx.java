class Haii extends Thread{
    public void run(){
        for(int i=1;i<4;i++){
            System.out.println("Task A: "+i);
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        }
    }
}
class Hellooo extends Thread{
    public void run(){
        for(int i=1;i<4;i++){
            System.out.println("Task B: "+i);
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        }
    }
}

public class ThreadEx {
    public static void main(String[] args)
    {
        Thread thread = new Haii();
        Thread thread1 = new Hellooo();
        thread.start();
        thread1.start();


    }
}
