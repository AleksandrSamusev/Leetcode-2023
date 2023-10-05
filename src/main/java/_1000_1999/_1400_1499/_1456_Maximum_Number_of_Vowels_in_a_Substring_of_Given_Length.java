package _1000_1999._1400_1499;

public class _1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {

    public static void show(String s, int k) {
        System.out.println(maxVowels(s,k));
    }


    public static int maxVowels(String s, int k) {
        int count = 0;
        for(int i = 0; i<k; i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        if(s.length()>k) {
            int min = 0;
            int max = k;
            int tempCount = count;
            while(max != s.length()) {
                if(s.charAt(min) == 'a' || s.charAt(min) == 'e' || s.charAt(min) == 'i' || s.charAt(min) == 'o' || s.charAt(min) == 'u') {
                    tempCount--;
                }
                if(s.charAt(max) == 'a' || s.charAt(max) == 'e' || s.charAt(max) == 'i' || s.charAt(max) == 'o' || s.charAt(max) == 'u') {
                    tempCount++;
                }
                if(tempCount >= count) {
                    count = tempCount;
                }
                min++;
                max++;
            }
        }
        return count;
    }

}
