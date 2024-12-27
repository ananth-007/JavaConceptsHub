import java.io.FileReader;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileReaders {
    public static void main(String[] args){
        String fileName = "example3.txt";
        //FileReader
        try(FileReader fr = new FileReader(fileName)){
            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char)ch+" ");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();

        //FileInputStream
        try(FileInputStream fis = new FileInputStream(fileName)){
            int byteValue;
            while((byteValue = fis.read()) != -1){
                System.out.print((char)byteValue+" ");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();

        //File.readAlLines()
        try{
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for(String line : lines){
                System.out.print(line);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
