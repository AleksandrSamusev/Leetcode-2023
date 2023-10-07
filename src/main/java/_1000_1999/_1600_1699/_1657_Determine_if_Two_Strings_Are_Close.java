package _1000_1999._1600_1699;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1657_Determine_if_Two_Strings_Are_Close {

public static void show(String w1, String w2) {
    System.out.println(closeStrings(w1, w2));
}

    public static boolean closeStrings(String word1, String word2) {
        int[] letters1 = new int[26];
        int[] letters2 = new int[26];

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(int i = 0; i<word1.length(); i++) {
            letters1[word1.charAt(i) - 'a']++;
            set1.add(word1.charAt(i));
        }

        for(int i = 0; i<word2.length(); i++) {
            letters2[word2.charAt(i) - 'a']++;
            set2.add(word2.charAt(i));
        }

        Arrays.sort(letters1);
        Arrays.sort(letters2);

        return set1.equals(set2) && Arrays.equals(letters1, letters2);
    }
}
