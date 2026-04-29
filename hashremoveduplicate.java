
import java.util.HashSet;

public class hashremoveduplicate {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 2, 3};
        String str[] = {"Trisha", "Munnu", "Asha", "Trisha"};
        HashSet<Integer> hashset = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashset.add(arr[i]);
        }
        HashSet<String> hashstr = new HashSet<>();
        for (int j = 0; j < str.length; j++) {
            hashstr.add(str[j]);
        }
        System.out.println(hashset);
        System.out.println(hashstr);
    }

}
