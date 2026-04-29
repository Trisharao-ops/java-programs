// missing no. in range of n

public class missingno {

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1, 3, 5, 7, 8, 10, 9};
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                }
            }
            if (!found) {
                System.out.println("missing numbers:" + i);
            }
        }
    }
}
