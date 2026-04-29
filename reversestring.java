
public class reversestring {

    public static void main(String[] args) {
        String str = "Trisha";
        String s = new String();
        for (char ch : str.toCharArray()) {
            s = ch + s;
        }
        System.out.println(s);
    }
}
