public class MinutesToHours {
    public static void main(String[] args) {
        int minutes = 125; // Example input
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + " mins → " + hours + " hours " + remainingMinutes + " mins");
    }
}
