
import java.util.HashSet;

public class hashmapfirstdup {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 76, 5, 2, 6, 8};
        HashSet<Integer> hashset = new HashSet<>();
        for (int val : arr) {
            if (hashset.contains(val)) {
                System.out.println(val);
                break;
            } else {
                hashset.add(val);
            }
        }
    }
}
