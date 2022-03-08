package PatternFastSlowPointers;

import java.util.HashMap;
import java.util.HashSet;

class Node {
    int data ;
    Node next = null;
    Node(int num){
        data = num;
        next=null;
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

    public static int findLengthByHashSet(Node head){
        Node elements = head;

        HashSet<Node> set = new HashSet<>();
        int temp =0;
        while (elements!=null){
            if (set.contains(elements)){
                break;
            }else {
                set.add(elements);
                elements = elements.next;
                temp++;
            }
        }
        Node containElements = head;
        int temp2 = 0;
        while ((containElements!=elements)){
            temp2++;
            containElements=containElements.next;
        }
        return temp-temp2+1;
    }

    public static int findLengthByHashMap(Node head){
        Node element = head;
        int position = 0;
        HashMap<Node,Integer> hm = new HashMap<>();
        while (element!=null) {
            if (!hm.containsKey(element)){
                hm.put(element,position);
                position++;
            } else{

                return (position-hm.get(element)+1);

            }
            element=element.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        System.out.println(findLength(head));

        head.next.next.next.next.next.next= head.next.next;
        System.out.println(findLengthByHashSet(head));

        head.next.next.next.next.next.next= head.next.next;
        System.out.println(findLengthByHashMap(head));
    }
}
