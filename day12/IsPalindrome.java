class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        ListNode newHead = reverse(slow); 
        ListNode t1 = head;
        ListNode t2 = newHead;

        while(t2 != null){
            if(t1.val != t2.val) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
    ListNode reverse(ListNode newHead){
        ListNode prev = null;
        ListNode curr = newHead;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}