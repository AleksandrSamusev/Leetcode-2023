package _1_999._300_399._328;

public class _328_Odd_Even_Linked_List {

    public static void show() {
        System.out.println(oddEvenList(new ListNode(2,
                new ListNode(1,
                        new ListNode(3,
                                new ListNode(5,
                                        new ListNode(6,
                                                new ListNode(4,
                                                        new ListNode(7)))))))).toString());
    }


    public static ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode evenHead = head.next;
        ListNode oddCurr = head;
        ListNode evenCurr = evenHead;

        while (oddCurr.next != null && evenCurr.next != null) {
            oddCurr.next = oddCurr.next.next;
            evenCurr.next = evenCurr.next.next;
            oddCurr = oddCurr.next;
            evenCurr = evenCurr.next;
        }
        oddCurr.next = evenHead;
        return head;
    }
}

