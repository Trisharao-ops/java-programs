
public class stringhiphen {

    public static void main(String[] args) {
        String str = "abbcabdc";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int repeat = ch - 'a' + 1;

            if (i > 0) {
                s.append("-");
            }
            for (int j = 0; j < repeat; j++) {
                s.append(ch);
            }
        }
        System.out.println(s.toString());
    }
}
