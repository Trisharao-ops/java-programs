//count vowels and consonants in string

import java.util.*;

public class countvowelandconson {

    public static void main(String[] args) {
        int vowel = 0;
        int consonant = 0;
        String str = "Java Programming";
        str = str.toLowerCase();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.contains(ch)) {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("vowels:" + vowel + " consonants:" + consonant);

    }
}
