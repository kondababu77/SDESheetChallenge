package day10;
class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int k = 0;
        while(temp!= null){
            temp = temp.next;
            k++;
        }
        if(k - n == 0){
            head = head.next;
            return head;
        }
        
        temp = head;
        
        for(int i=1; i< k- n; i++){
            temp = temp.next;
        }
        ListNode curr = temp;
        curr.next = temp.next.next;
        return head;
    }
}