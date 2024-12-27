import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args){

        try{
            uploadFile();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }

    }

    public static void uploadFile() throws FileNotFoundException{
        File fr = new File("text.txt");
        FileReader fi = new FileReader(fr);
    }

}
