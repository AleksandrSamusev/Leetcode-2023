package _1_999._300_399;

public class _392_Is_Subsequence {

    public static void show(String s, String t) {
        System.out.println(isSubsequence(s, t));
    }


    public static boolean isSubsequence(String s, String t) {
        int startPos = 0;
        for (int i = 0; i < s.length(); i++) {
            startPos = findLetterIndex(s.charAt(i), t, startPos);
            if (startPos == -1) {
                return false;
            }
            startPos++;
        }
        return true;
    }

    public static int findLetterIndex(char ch, String t, int startPos) {
        for (int i = startPos; i < t.length(); i++) {
            if (t.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}
