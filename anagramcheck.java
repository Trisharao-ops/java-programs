
import java.util.Arrays;

public class anagramcheck {

    public static void main(String[] args) {
        String str = "listen";
        String str1 = "silent";
        char ch1[] = str.toCharArray();
        char ch2[] = str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
