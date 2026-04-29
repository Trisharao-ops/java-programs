
import java.util.HashMap;

public class freqpair {

    public static void main(String[] args) {
        String str = "she is good grid god and ground player plotter";
        String arr[] = str.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String words : arr) {
            String pair = "" + words.charAt(0) + words.charAt(words.length() - 1);
            map.put(pair, map.getOrDefault(pair, 0) + 1);
        }
        int max = 0;
        for (int val : map.values()) {
            if (val > max) {
                max = val;
            }
        }
        String result = "";
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                result = key;
            }
        }
        System.out.println(result);

    }
}
