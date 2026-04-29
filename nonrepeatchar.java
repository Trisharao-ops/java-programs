//non repeat char in the string

import java.util.*;

public class nonrepeatchar {

    public static void main(String[] args) {
        String s = "swiss";
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (hmap.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
