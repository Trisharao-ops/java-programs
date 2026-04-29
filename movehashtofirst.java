
public class movehashtofirst {

    public static void main(String[] args) {
        String str = "#aa#bs#cbsy#p";
        StringBuilder s = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                s.append(ch);
            }
        }
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                s.append(ch);
            }
        }
        System.out.println(s.toString());
    }
}
