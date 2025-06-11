import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        Map <Integer, String> player = new TreeMap<Integer,String>();
        player.put(7, "Dhoni");
        player.put(18, "king kohli");
        player.put(33, "hardik");
        player.put(1, "rahul");
        player.put(77, "gill");

        player.remove(77);

        System.out.println(player);
        System.out.println(player.get(7));
        System.out.println(player.getOrDefault(8, "Guruteja"));
        System.out.println(player.containsKey(18));
        System.out.println(player.containsValue("rahul"));
        System.out.println(player.keySet());
        System.out.println(player.values());
    }
}
