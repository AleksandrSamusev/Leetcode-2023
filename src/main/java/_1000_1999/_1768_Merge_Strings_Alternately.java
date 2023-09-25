package _1000_1999;

public class _1768_Merge_Strings_Alternately {


    public static void show(String word1, String word2) {
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {

        int len = findShortest(word1, word2).length();
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());
        int i;
        for (i = 0; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (word1.length() - i > 0) {
            for (int j = i; j < word1.length(); j++) {
                sb.append(word1.charAt(j));
            }
        } else if (word2.length() - i > 0) {
            for (int j = i; j < word2.length(); j++) {
                sb.append(word2.charAt(j));
            }
        }
        return sb.toString();
    }

    private static String findShortest(String word1, String word2) {
        if (word1.length() >= word2.length()) {
            return word2;
        }
        return word1;
    }
}
