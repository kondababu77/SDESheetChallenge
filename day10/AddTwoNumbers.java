/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        ListNode t1 = l1;
        ListNode t2 = l2;
        int sum = 0;
        while(t1 != null && t2 != null){
            sum += t1.val + t2.val;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            sum = sum/10;
            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1 != null){
            sum += t1.val;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            sum = sum/10;
            t1 = t1.next;
        }
        while(t2 != null){
            sum += t2.val;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            sum = sum/10;
            t2 = t2.next;
        }
        if(sum != 0){
            temp.next = new ListNode(sum);
        } 
        return ans.next;   
    }
}