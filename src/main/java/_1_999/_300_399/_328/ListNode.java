package _1_999._300_399._328;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
      this.val = val;
    }

    public ListNode(int val, ListNode next) {
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
