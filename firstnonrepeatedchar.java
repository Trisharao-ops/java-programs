//1st non repeated char in string

public class firstnonrepeatedchar {

    public static void main(String[] args) {
        String str = "automation";
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("1st non repeated character:" + ch);
                break;
            }
        }
    }
}
