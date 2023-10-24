package _2000_2999._2800_2899;

import java.util.List;

public class _2824_Count_Pairs_Whose_Sum_is_Less_than_Target {

    public static void show() {
        System.out.println(countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int pairs = 0;
        for(int i = 0; i<nums.size()-1; i++) {
            for(int j = i+1; j<nums.size(); j++) {
                if(nums.get(j) + nums.get(i) < target) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

}
