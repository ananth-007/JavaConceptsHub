interface Lambda2{
    void details(String name, String location);
}

public class LambdaExpressionEx {
    public static void main(String[] args){
        Lambda2 obj = (name,location) -> System.out.println("Name: "+name+" | Location: "+location);
        obj.details("Ananth","Bengaluru");
    }
}
