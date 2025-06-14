import java.util.Scanner;
public class panagram {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char namearr[] = name.toUpperCase().toCharArray();
        boolean flag = false;   
        int arr[] = new int[26];
        for (int i = 0; i < namearr.length; i++) {

            if (namearr[i] >= 'A' && namearr[i] <= 'z') 
                arr[namearr[i]-'A']++;
                else continue;
            
            }
            int i = 0;
            while (true&&i<26){
                if (arr[i]==0){
                    flag = false;
                    break;
                }
                else 
                flag = true;
                i++;
            
        }  
        if (flag){
            System.out.println("panagram");
        }
        else {
            System.out.println("Not a panagram");
        }
    }
}