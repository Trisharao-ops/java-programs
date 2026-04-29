
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortlistarray {

    public static void main(String[] args) {
        int arr[] = {60, 38, 32, 92, 3, 41};
        List<Integer> intlist = new ArrayList<Integer>();
        for (int value : arr) {
            intlist.add(value);
        }
        Collections.sort(intlist);
        System.out.println(intlist);
    }
}
