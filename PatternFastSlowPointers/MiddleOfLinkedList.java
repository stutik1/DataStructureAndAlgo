//Problem Statement
//Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.

package PatternFastSlowPointers;

class LinkedList{
    int val;
    LinkedList next = null;
    LinkedList(int val){
        this.val= val;
    }
}
public class MiddleOfLinkedList {
    public static LinkedList middleOfLinkedList(LinkedList head){
        if(head == null){
            return null;
        }
        LinkedList slow =head;
        LinkedList fast = head;
       while (fast!= null && fast.next !=null){
           slow=slow.next;
           fast = fast.next.next;
       }
       return slow;
    }
    public static void main(String[] args) {
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next.next = new LinkedList(5);
        head.next.next.next.next.next = new LinkedList(6);

        System.out.println(middleOfLinkedList(head).val);
    }
}
