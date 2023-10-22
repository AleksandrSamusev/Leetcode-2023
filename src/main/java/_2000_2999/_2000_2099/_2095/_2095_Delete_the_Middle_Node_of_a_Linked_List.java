package _2000_2999._2000_2099._2095;

public class _2095_Delete_the_Middle_Node_of_a_Linked_List {

    public static void show() {
        System.out.println(deleteMiddle(new ListNode(1,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(7,
                                        new ListNode(1,
                                                new ListNode(2,
                                                        new ListNode(6)))))))).toString());
    }

    public static ListNode deleteMiddle(ListNode head) {

        if (head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prevSlow = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;
        }
        prevSlow.next = slow.next;
        return head;
    }

}
