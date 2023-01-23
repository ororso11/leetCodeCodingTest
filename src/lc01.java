public class lc01 {

    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode o_head = head;
        ListNode n_head = null;

        while ( o_head != null ) {
            ListNode node = o_head;
            o_head = o_head.next;

            node.next = n_head;
            n_head = node;
        }

        return n_head;

    }

    public static void main(String[] args) {

    }
}
