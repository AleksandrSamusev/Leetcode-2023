package _2000_2999._2300_2399;

import java.util.Arrays;

public class _2341_Maximum_Number_of_Pairs_in_Array {

    public static void show() {
        System.out.println(Arrays.toString(numberOfPairs(new int[]{1, 3, 2, 1, 3, 2, 2})));
    }

    public static int[] numberOfPairs(int[] nums) {

        int pairs = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != -1) {

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[j] == nums[i]) {
                        pairs++;
                        nums[j] = -1;
                        break;
                    }
                }
            }

        }
        return new int[]{pairs, nums.length-pairs*2};
    }
}
