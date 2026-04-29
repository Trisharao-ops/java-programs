
import java.util.*;

public class targetsum {

    public static void findPairs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("(" + arr[left] + "," + arr[right] + ")");
                while (left < right && arr[left] == arr[left + 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right - 1]) {
                    right--;
                }
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6};
        int target = 6;

        Arrays.sort(arr); // ensure sorted
        findPairs(arr, target);
    }
}
