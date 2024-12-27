import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;

public class FileWriters {
    public static void main(String[] args) throws IOException {
        //file.createNewFile() method
        File file = new File("output.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists or failed to create one.");
            }

            FileWriter fw = new FileWriter("output.txt");
            fw.write("Welcome to files\n");
            fw.write("Welcome to Earth");
            System.out.println("Content written successfully");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //FileOutputStream
        System.out.println();
        try{
        FileOutputStream fos = new FileOutputStream("output2.txt");
        String content = "AJAY";
        byte[] bytes = content.getBytes();
        fos.write(bytes);
        System.out.println("Content written successfully");
        System.out.println(Arrays.toString(bytes));
        fos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        //Files.write() method
        File file1 = new File("output3.txt");
        String contain = "Welcome\n"+"to\n"+"Java";
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists or failed to create one.");
            }
            Files.write(Paths.get("output3.txt"),contain.getBytes());
            System.out.println(Arrays.toString(contain.getBytes()));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
