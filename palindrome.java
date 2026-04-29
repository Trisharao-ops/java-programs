
public class palindrome {

    public static void main(String[] args) {
        String str = "Trisha";
        String s = new String();
        for (char ch : str.toCharArray()) {
            s = ch + s;
        }
        str = str.toLowerCase();
        s = s.toLowerCase();
        if (str.equals(s)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
