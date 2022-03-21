package PatternFastSlowPointers;

class Nodee{
    int val;
    Nodee next =null;
    Nodee(int val){
        this.val=val;

    }
}

public class StartofLinkedListCycle {
    public static Nodee startofLinkedListCycle(Nodee head){

        Nodee low = head;
        Nodee high = head;

        while (low!=null && high!=null&&high.next!=null){
            low=low.next;
            high=high.next.next;
            if (low==high){
                break;
            }
        }
        if (low!=high)
            return null;

        low=head;
        while (low!=high){
            low=low.next;
            high=high.next;
        }
        return low;
    }

    public static void main(String[] args) {
        Nodee head = new Nodee(1);
        head.next = new Nodee(2);
        head.next.next = new Nodee(3);
        head.next.next.next = new Nodee(4);
        head.next.next.next.next = new Nodee(5);
        head.next.next.next.next.next = new Nodee(6);
        head.next.next.next.next.next.next = new Nodee(7);
        System.out.println(startofLinkedListCycle(head));

        head.next.next.next.next.next.next= head.next;
        System.out.println(startofLinkedListCycle(head).val);
    }
}
