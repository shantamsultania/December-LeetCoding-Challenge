public class day24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = swapPairs(head.next.next);
        ListNode temp = head.next;
        head.next = node;
        temp.next = head;
        return temp;


    }

}
