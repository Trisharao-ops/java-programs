//merge two arrays and sort them

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergesort {

    public static void main(String args[]) {
        int arr[] = {3, 56, 23, 672, 21};
        int arr1[] = {37, 78, 27, 12, 2};
        List<Integer> l1 = new ArrayList<Integer>();
        for (int value : arr) {
            l1.add(value);
        }
        for (int value : arr1) {
            l1.add(value);
        }
        Collections.sort(l1);
        System.out.println(l1);
    }
}
