package _1_999._300_399;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _345_Reverse_Vowels_of_a_String {


    public static void show(String s) {
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        List<Character> ch = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        if(s.length() == 1) {
            return s;
        }

        for(int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' ||s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                ch.add(s.charAt(i));
            }
        }

        String vowels = ch.stream().map(String::valueOf).collect(Collectors.joining(""));
        int pos = vowels.length()-1;

        for(int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' ||s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                sb.append(vowels.charAt(pos));
                pos--;
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
