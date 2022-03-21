//Problem Statement
//Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.

package PatternFastSlowPointers;

 class ListNode {
   int val;
    ListNode next;
    ListNode(int x) {
       val = x;
   }
}
 public class LinkedListCycle {
    public static boolean linkedListCycle(ListNode head){
            if(head == null || head.next ==null)
                return false;
            ListNode slow = head;
            ListNode fast = head.next;
            while(slow!=fast){
                if(fast== null || fast.next==null){
                    return false;
                }
                slow = slow.next;
                fast =fast.next.next;
            }
            return true;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(linkedListCycle(head) );
        // Create a loop for testing(5 is pointing to 3)
        head.next.next.next.next.next = head.next.next;
        System.out.println(linkedListCycle(head) );

        head.next.next.next.next = head;
        System.out.println(linkedListCycle(head) );




    }
}
