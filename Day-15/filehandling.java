import java.io.*;

public class filehandling {
    public static void main(String[] args) {
        try{
            File file = new File("Guruteja.xlcx");
            if (file.createNewFile()){
                System.out.println("File is created");
    
            }
            else{
                System.out.println("Not created");
            }
            
            
        }
        catch(IOException e){
            System.err.println("An error creating file "+e);

    
        }
        
    }
}
