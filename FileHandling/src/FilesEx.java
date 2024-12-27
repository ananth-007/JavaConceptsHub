import java.io.File;
import java.io.IOException;


public class FilesEx {
    public static void main(String[] args){
        File file = new File("Ananth.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully.");
            }else{
                System.out.println("Failed to create the file");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
