
import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Trisha");
        hmap.put(2, "Munnu");
        hmap.put(9, "Asha");
        hmap.put(4, "John");
        hmap.put(8, "Shero");
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            if (entry.getValue() == "John") {
                int k = entry.getKey();
                hmap.put(k, "Mr.John");

            }
        }
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }

}
