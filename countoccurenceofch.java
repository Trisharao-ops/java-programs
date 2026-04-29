//no.of times a char occured in string

public class countoccurenceofch {

    public static void main(String[] args) {
        String str = "Malla Reddy College of Engineering and technology";
        str = str.toLowerCase();
        Character ch = 'm';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
