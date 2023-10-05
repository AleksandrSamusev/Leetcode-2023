package _1_999._600_699;

public class _643_Maximum_Average_Subarray_I {

    public static void show(int[] nums, int k) {
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double avg=0;

        for(int i = 0; i<k; i++) {
            sum += nums[i];
        }
        avg = (double)sum/k;

        if(nums.length > k) {
            int min = 0;
            int max = k;
            while(max != nums.length) {
                sum = sum - nums[min] + nums[max];
                double tempAvg = (double)(sum)/k;
                if(tempAvg > avg) {
                    avg = tempAvg;
                }
                max++;
                min++;
            }
        }
        return avg;
    }
}
