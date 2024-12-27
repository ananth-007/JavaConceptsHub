class Degree extends Thread{
    public void run(){
        for(int i=1;i<2;i++){
            System.out.println("Atria Institute of Technology: "+i);
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        }
    }
}
class Puc extends Thread{
    public void run(){
        for(int i=1;i<2;i++){
            System.out.println("Narayan PU College: "+i);
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        }
    }
}
class School extends Thread{
    public void run(){
        for(int i=1;i<2;i++){
            System.out.println("St Mary's High School: "+i);
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        }
    }
}

public class ThreadEx2 {
    public static void main(String[] args)
    {
        Thread obj = new School();
        obj.start();
        Thread obj1 = new Puc();
        obj1.start();
        Thread obj2 = new Degree();
        obj2.start();
    }
}
