import java.io.FileWriter;
import java.util.*;

public class file2handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        String s = "This is " +table+ " table.";
        try {
            FileWriter obj = new FileWriter("Guru.pdf",true);
            obj.write("\n"+s+"\n");
            for (int i =1; i <=10; i++) {
                obj.write(table+" x "+i+" = "+table*i+"\n");
                
            }
            obj.close();
        } catch (Exception e) {
        }

    }
    
}
