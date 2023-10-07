package _2000_2999._2200_2299;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2215_Find_the_Difference_of_Two_Arrays {

    public static void show(int[] num1, int[] num2) {
        System.out.println(findDifference(num1, num2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> firstArray = new HashSet<>();
        Set<Integer> secondArray = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> ans0 = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();

        for(Integer num: nums1) {
            firstArray.add(num);
        }
        for(Integer num: nums2) {
            secondArray.add(num);
        }
        for(Integer num: nums1) {
            if(!secondArray.contains(num) && !ans0.contains(num)) {
                ans0.add(num);
            }
        }
        for(Integer num: nums2) {
            if(!firstArray.contains(num) && !ans1.contains(num)) {
                ans1.add(num);
            }
        }
        answer.add(ans0);
        answer.add(ans1);
        return answer;
    }
}
