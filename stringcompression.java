
import java.util.*;

public class stringcompression {

    public static void main(String[] args) {
        String str = "aaabbcca";
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            result.append(entry.getKey());
            result.append(entry.getValue());
        }
        System.out.println(result.toString());
    }
}
