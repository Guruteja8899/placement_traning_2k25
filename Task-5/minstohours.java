public class minstohours {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + " minutes is equal to " + hours + " hours and " + remainingMinutes + " minutes.");
        sc.close();
    }

    
}
