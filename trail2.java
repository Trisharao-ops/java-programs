
public class trail2 {

    public static void main(String[] args) {
        String arr[] = {"tegcuwq"};
        String novowels = "";
        for (String s : arr) {
            novowels = s.replaceAll("[aeiouAEIOU]", "");
        }
        int n = novowels.length();
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

}
