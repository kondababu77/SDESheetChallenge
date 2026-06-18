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
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head, prev = null;
        while(temp != null){
            ListNode kthNode = getKthNode(temp , k);
            if(kthNode == null){
                if(prev != null) prev.next = temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            ListNode newHead = reverse(temp);
            if(temp == head){
                head = newHead;
            }else{
                prev.next = newHead;
            }
            prev = temp;
            temp = nextNode;
        } 
        return head;    
    }
    ListNode getKthNode(ListNode temp , int k){
        k--;
        while(k > 0 && temp!= null){
            temp = temp.next;
            k--;
        }
        return temp;
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