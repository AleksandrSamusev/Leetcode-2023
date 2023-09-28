package _1_999._200_299;

import java.util.Arrays;

public class _238_Product_of_Array_Except_Self {

    public static void show(int[] nums) {
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        if(nums.length == 2) {
            return new int[]{nums[1], nums[0]};
        }

        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i = 1; i< nums.length;i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        for(int i = nums.length-2; i>=0; i--) {
            right[i] = nums[i+1]*right[i+1];
        }
        for(int i = 0; i< nums.length; i++) {
            answer[i] = left[i]*right[i];
        }
        return answer;
    }
}
