package day11;
class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class IntersectionNodelution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        int n1 = 0;
        int n2 = 0;
        while(t1 != null){
            t1 = t1.next;
            n1++;
        }
        while(t2 != null){
            t2 = t2.next;
            n2++;
        }
        t1 = headA;
        t2 = headB;
        if(n1 > n2){
            for(int i=1; i<= n1 - n2; i++){
                t1 = t1.next;
            }
        }else{
            for(int i=1; i<= n2-n1; i++){
                t2 = t2.next;
            }
        }
        while(t1 != null || t2 != null){
            if(t1 == t2) return t1;
            t1 = t1.next;
            t2 = t2.next;
        }
        return null;    
    }
}