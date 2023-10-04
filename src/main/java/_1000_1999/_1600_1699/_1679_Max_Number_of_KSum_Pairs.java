package _1000_1999._1600_1699;

import java.util.Arrays;

public class _1679_Max_Number_of_KSum_Pairs {

    public static void show(int[] nums, int k) {
        System.out.println(maxOperations(nums, k));
    }

    //{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4} k=2
    // sorted {1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,5}    k=2

    public static int maxOperations(int[] nums, int k) {
        int ops = 0;
        Arrays.sort(nums);

        for(int i = 0; i< nums.length-1; i++) {
            if(nums[i] != 0) {
                if(nums[i] > k) {
                    return ops;
                }
                int number = nums[i];
                for(int j = i + 1; j<nums.length; j++) {
                    if(nums[j] > k) {
                        break;
                    }
                    if(nums[j] != 0) {
                        if(nums[j] + nums[i] == k) {
                            ops++;
                            nums[j] = 0;
                            nums[i] = 0;
                            break;
                        }
                    }
                }
            }
        }
        return ops;
    }
}
