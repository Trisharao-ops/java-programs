//max sum of subarray of length k

import java.util.Arrays;

public class maxsumofarray {

    public static void main(String[] args) {
        int sum = 0;
        int k = 3;
        int arr[] = {13, 5, 1, 2, 1, 5, 3, 7};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
