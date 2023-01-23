public class lc02 {
    // 추후 다시 푼다. 링크드 리스트 범위
    Node node;

    class Node {
        int data;
        Node next;
        public Node(int userData) {
            data = userData;
        }
    }

    public Node reverseBetween(Node head, int left, int right) {

        Node o_head = head;
        Node n_head = null;

        while ( o_head != null ) {
            Node node = o_head;

            if( left <= o_head.data && o_head.data <= right ) {
                o_head = o_head.next;

                node = n_head.next;
                n_head = node;
            }
            node = o_head.next;
            n_head = node;
        }
        return n_head;
    }





    public static void main(String[] args) {

    }
}
