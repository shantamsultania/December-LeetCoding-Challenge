import java.util.List;
import java.util.Random;

public class day2 {

    //Given a singly linked list,
    // return a random node's value from the linked list. Each node must have the same probability of being chosen.
    //
    //Follow up:
    //What if the linked list is extremely large and its length is unknown to you?
    // Could you solve this efficiently without using extra space?

//    // Init a singly linked list [1,2,3].
//    ListNode head = new ListNode(1);
//    head.next = new ListNode(2);
//    head.next.next = new ListNode(3);
//    Solution solution = new Solution(head);
//
//// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
//solution.getRandom();


    ListNode head;
    day2()
    {
        head = null;
    }

    void insert(int []a) {

        head = new ListNode(a[0]);
        ListNode temp = head;
        int i = 1;
        while (i < a.length) {
            temp.next = new ListNode(a[i]);
            temp = temp.next;
            i++;
        }

    }
    void printall()
    {
        ListNode header = head;
        while (header != null)
        {
            System.out.print(header.data+"  ");
            header = header.next;
        }
    }

    void get_random()
    {
        Random r = new Random();

        ListNode temp = head;
        int c = 1;
        int result = 0;
        while (temp != null)
        {
            if ( r.nextInt(c) == 0) {
                result = temp.data;
            }
            c++;
            temp = temp.next;
        }
        System.out.println(result);


    }

}
