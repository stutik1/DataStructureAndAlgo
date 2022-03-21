package PatternFastSlowPointers;

 class ListsNode{
     int value ;
     ListsNode next = null;
     ListsNode(int value){

         next=null;
     }
}
public class PalindromeOfLinkedList {
     public static boolean palindromeOfLinkedList(ListsNode head ){
         if(head == null || head.next==null){
             return true;
         }
return true;
     }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

       // System.out.println(palindromeOfLinkedList(head));

    }
}
