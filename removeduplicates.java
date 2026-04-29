
import java.util.Arrays;

public class removeduplicates {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 2};
        String str[] = {"Trisha", "Munnu", "John", "Trisha"};
        Arrays.sort(arr);
        Arrays.sort(str);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.println(arr[k]);
        }
        int p = 0;
        for (int q = 1; q < str.length; q++) {
            if (str[q] != str[p]) {
                p++;
                str[p] = str[q];
            }
        }
        for (int s = 0; s <= p; s++) {
            System.out.println(str[s]);
        }
    }
}
