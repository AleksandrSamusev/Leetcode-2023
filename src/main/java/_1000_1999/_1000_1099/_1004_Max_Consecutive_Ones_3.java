package _1000_1999._1000_1099;

public class _1004_Max_Consecutive_Ones_3 {

    public static void show(int[] nums, int k) {
        System.out.println(longestOnes(nums, k));
    }

    //nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
    //

    public static int longestOnes(int[] nums, int k) {
        int first = 0;
        int last = 0;
        while (last < nums.length) {
            if (nums[last] == 0) {
                k--;
            }
            last++;
            if (k < 0) {
                if (nums[first] == 0) {
                    k++;
                }
                first++;
            }
        }
        return last - first;
    }

}
