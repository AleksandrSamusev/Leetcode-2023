package _1000_1999;

import java.util.ArrayList;
import java.util.List;

public class _1431_Kids_With_the_Greatest_Number_of_Candies {

    public static void show(int[] candies, int extraCandies) {
        System.out.println(kidsWithCandies(candies, extraCandies));
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int j : candies) {
            if (j >= max) {
                max = j;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
