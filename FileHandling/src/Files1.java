import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Files1 {
    public static void main(String[] args){
        File file = new File("example.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully");
            }else{
                System.out.println("File already exists or failed to create one.");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        try(FileOutputStream fos = new FileOutputStream("example2.txt")){
            System.out.println("File created successfully");
            String data = "Hello";
            Files.write(Paths.get("example2.txt"),"World".getBytes());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        String fileName = "example3.txt";
        try{
            Files.write(Paths.get(fileName),"Ananth".getBytes());
            System.out.println("File created successfully");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}