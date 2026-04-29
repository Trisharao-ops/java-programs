//return 1st non repeated integr in array

import java.util.*;

public class firstnonrepeat {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 4, 4, 5, 8};
        Arrays.sort(arr);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                System.out.println(num);
                break;
            }
        }
    }
}
