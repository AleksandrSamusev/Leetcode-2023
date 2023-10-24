package _2000_2999._2100_2199._2130;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode temp = this;

        while(temp.next != null) {
            sb.append(temp.val);
            temp = temp.next;
        }
        sb.append(temp.val);
        return sb.toString();
    }
}
