package _1000_1999;

import java.util.Arrays;

public class _1929_Concatenation_of_Array {

    public static void show(int[] nums) {
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        if (nums.length == 1) {
            return new int[]{nums[0], nums[0]};
        } else {
            int n = nums.length;
            int[] ans = new int[2 * n];

            for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[i];
                ans[n + i] = nums[i];
            }
            return ans;
        }
    }
}
