//count words in string

public class countwordsinstring {

    public static void main(String[] args) {
        String str = "MALLA REDDY COLLEGE OF ENGINEERING AND TECHNOLOGY";
        String[] s = str.split(" ");
        int count = s.length;
        System.out.println("no.of words are:" + count);
    }
}
