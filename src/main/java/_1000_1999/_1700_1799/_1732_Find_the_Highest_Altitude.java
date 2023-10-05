package _1000_1999._1700_1799;

public class _1732_Find_the_Highest_Altitude {

    public static void show(int[] gain) {
        System.out.println(largestAltitude(gain));
    }

    public static  int largestAltitude(int[] gain) {
        int max = 0;
        int prev = 0;
        for(int i = 0; i<gain.length; i++) {
            int temp = gain[i] + prev;
            if (temp > max) {
                max = temp;
            }
            prev = temp;
            gain[i] = prev;
        }
        return max;
    }
}
