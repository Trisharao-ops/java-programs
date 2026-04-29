
public class subarrmiddlemax {

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 4, 3, 9, 5};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i <= n - 3; i++) {
            if (arr[i] + arr[i + 2] == arr[i + 1]) {
                System.out.println("(" + arr[i] + "," + arr[i + 1] + ',' + arr[i + 2] + ")");
                count++;
            }
        }
        System.out.println(count);
    }
}
