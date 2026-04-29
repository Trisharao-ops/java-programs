
import java.util.*;

public class repeatedelement {

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 5, 2, 2, 8};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getKey();
            }
        }
        System.out.println("Highest repeated:" + count);
    }
}
