import java.io.File;


public class FilesEx {
    public static void main(String[] args){
        File file = new File("Ananth.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully.");
            }else{
                System.out.println("Failed to create the file");
            }
        }

    }
}
