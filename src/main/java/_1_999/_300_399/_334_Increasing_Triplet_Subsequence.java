package _1_999._300_399;

import java.util.Arrays;

public class _334_Increasing_Triplet_Subsequence {

    public static void show(int[] nums) {
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int min = nums[0];

        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, temp.length);
        Arrays.sort(temp);
        int max = temp[temp.length - 1]; // max == 100

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                if (nums[i] != max) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] > nums[i]) {
                            return true;
                        }
                    }
                }
            } else {
                min = nums[i];
            }
        }
        return false;
    }
}
