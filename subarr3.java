
public class subarr3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 2, 4, 2};
        int n = arr.length;

        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (arr[i] + arr[i + 2] == arr[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
