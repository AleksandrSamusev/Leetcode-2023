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

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int halfLength = count / 2;

        count = 0;
        curr = head;

        while (count < halfLength) {
            list1.add(curr.val);
            count++;
            curr = curr.next;
        }

        while (curr != null) {
            list2.add(curr.val);
            curr = curr.next;
        }

        int max = 0;
        for (int i = 0; i < list1.size(); i++) {
            int temp_sum = list1.get(i) + list2.get(list2.size()-1-i);
            if (temp_sum >= max) {
                max = temp_sum;
            }
        }
        return max;
    }

}
