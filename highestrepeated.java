
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class highestrepeated {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 2, 45, 12, 4, 3, 2, 0}; //{0,1,2,2,2,3,3,4,4,12,45}
        Arrays.sort(arr);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int num : arr) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getKey();
            }
        }
        System.out.println("highest repeating number is " + count);

    }
}
