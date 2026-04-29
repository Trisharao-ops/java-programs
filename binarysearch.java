
import java.util.*;

public class binarysearch {

    public static void main(String[] args) {
        int arr[] = {1, 34, 349, 23, 78, 5, 32, 87, 45};
        int target = 87;
        int low = 0;
        int high = arr.length - 1;
        Arrays.sort(arr);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("found at:" + mid);
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
