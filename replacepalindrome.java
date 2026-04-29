
public class replacepalindrome {

    public static void main(String args[]) {
        String str = "A man, a plan, a canal: Panama";
        String srev = "";
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (char ch : str.toCharArray()) {
            srev = ch + srev;
        }
        if (str.equals(srev)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
