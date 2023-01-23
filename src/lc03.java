public class lc03 {

    static Node head;

    class Node {
        int data;
        Node next;

        public Node(int userStr) {
            data = userStr;
        }
    }

    public void insert(int userNums) {
        Node newHead = new Node(userNums);

        if( head == null ) {
            head = newHead;
            return;
        }
        newHead.next = head;
        head = newHead;

    }

    public static int getDecimalValue(Node head) {

        Node o_head = head;
        String str = "";

        while (o_head != null) {
            str += o_head.data;
            o_head = o_head.next;
        }

        return Integer.parseInt(str,2);
    }


    public static void main(String[] args) {
        lc03 node1 = new lc03();
        node1.insert(1);
        node1.insert(0);
        node1.insert(1);

        int res = getDecimalValue(head);
        System.out.println(res);
    }
}
