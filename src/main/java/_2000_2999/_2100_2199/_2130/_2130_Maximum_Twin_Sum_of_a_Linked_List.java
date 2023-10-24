package _2000_2999._2100_2199._2130;

import java.util.ArrayList;
import java.util.List;

public class _2130_Maximum_Twin_Sum_of_a_Linked_List {

    public static void show() {
        System.out.println(pairSum(new ListNode(4,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(3))))));
    }

    public static int pairSum(ListNode head) {

        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int max = 0;
        for (int i = 0; i < list.size()/2; i++) {
            int temp_sum = list.get(i) + list.get(list.size()-1-i);
            if (temp_sum >= max) {
                max = temp_sum;
            }
        }
        return max;
    }
}
