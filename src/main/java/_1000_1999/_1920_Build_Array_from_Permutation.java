package _1000_1999;

import java.util.Arrays;

public class _1920_Build_Array_from_Permutation {

    public static void show(int[] nums) {
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
