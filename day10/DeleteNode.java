package day10;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        ListNode prev = temp;
        while(temp.next != null){
            prev = temp;
            temp.val = temp.next.val;
            temp = temp.next;
        }
        prev.next = null;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNode_OofN {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}