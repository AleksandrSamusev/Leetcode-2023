package _1000_1999._1400_1499;

public class _1493_Longest_Subarray_of_1s_After_Deleting_One_Element {

    public static void show(int[] nums) {
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int zeros = 0;
        int start = 0;
        int window = 0;

        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == 0) {
                zeros++;
            }
            while(zeros > 1) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
            window = Math.max(window,i-start);
        }
        return window;
    }
}
