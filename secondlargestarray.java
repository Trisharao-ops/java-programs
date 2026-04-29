
import java.util.*;

public class secondlargestarray {

    public static void main(String[] args) {
        int arr[] = {2373, 2738, 9483, 1273};
        int num = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            num = arr[arr.length - 2];
        }
        System.out.println(num);

    }
}
