package _1000_1999._1200_1299;

import java.util.HashSet;
import java.util.Set;

public class _1207_Unique_Number_of_Occurrences {

    public static void show(int[] arr) {
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        int[] occurrences = new int[2001];
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int j : arr) {
            if (j >= 0) {
                occurrences[j]++;
            } else {
                occurrences[Math.abs(j) + 1000]++;
            }
        }

        for (int occurrence : occurrences) {
            if (occurrence != 0) {
                count++;
                set.add(occurrence);
            }
        }
        return count == set.size();
    }

}
