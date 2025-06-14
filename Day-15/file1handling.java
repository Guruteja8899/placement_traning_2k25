import java.io.FileWriter;

public class file1handling {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("Guruteja.xlcx");
            obj.write("this is my file handling class \n welcome \n iam guruteja i came from anantapur i am pursuing btech in kalasalingam college in tamilnadu , iam selfmotivating and smart thinking abilities i have");
            obj.close();
        } catch (Exception e) {

        }
    }
}
