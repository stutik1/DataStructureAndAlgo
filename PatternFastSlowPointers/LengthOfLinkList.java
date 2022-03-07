package PatternFastSlowPointers;
class Node {
    int data ;
    Node next = null;
    Node(int value){

    }
}

public class LengthOfLinkList {
    public static int findLength(Node head){
        Node temp = head;
        int count =0;
        if(temp ==null){
            return  count;
        }
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(findLength(head));
    }
}
