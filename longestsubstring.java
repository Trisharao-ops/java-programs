
public class longestsubstring {

    public static void main(String[] args) {
        String s = "abcabbadc";
        String str = "";
        int maxlen = 0;
        for (char ch : s.toCharArray()) {
            if (!str.contains(String.valueOf(ch))) {
                str = str + ch;
            } else {
                maxlen = Math.max(maxlen, str.length());
                str = "" + ch;
            }
        }
        maxlen = Math.max(maxlen, str.length());
        System.out.println(maxlen);
    }
}
