class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = new ListNode();
        temp = null;

        ListNode prev = head;
        ListNode last = prev.next;

        while(last != null){
            prev.next = temp;
            temp = prev;
            prev = last;
            last = last.next;
        }
        prev.next = temp;
        return prev;
    } 
}