
import java.util.*;

public class substringcount {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abcdefgh";
        int k = 2;
        Set<String> uniquestring = new HashSet<>();
        int n = s1.length();
        if (k > n) {
            System.out.println("0");
        }
        for (int i = 0; i <= n - k; i++) {
            String substring = s1.substring(i, i + k);
            uniquestring.add(substring);
        }
        int count = 0;
        for (String sub : uniquestring) {
            if (s2.contains(sub)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
