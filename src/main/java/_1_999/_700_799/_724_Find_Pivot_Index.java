package _1_999._700_799;

public class _724_Find_Pivot_Index {

    public static void show(int[] nums) {
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;

        for(int i = 0; i<nums.length; i++) {
            sum += nums[i];
        }

        for(int i = 0; i<nums.length; i++) {
            if(leftSum == sum - nums[i] - leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
