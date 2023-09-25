package _1_999._300_399;

public class _389_Find_the_Difference {

    public static void show(String s, String t) {
        System.out.println(findTheDifference(s, t));
    }

    private static char findTheDifference(String s, String t) {

        int[] countLetters = new int[26];

        for(int i = 0; i<s.length();i++) {
            countLetters[s.charAt(i)-'a']++;
            countLetters[t.charAt(i)-'a']--;
        }
        countLetters[t.charAt(t.length()-1)-'a']--;

        for(int i = 0; i< countLetters.length;i++) {
            if(countLetters[i] < 0) {
                return (char) (i + 'a');
            }
        }
        return 0;
    }
}
