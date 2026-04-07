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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if (head == null) return head;

        // Step 1: Remove val from beginning (important)
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;

        // Step 2: Traverse and remove
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next; // delete node
            } else {
                temp = temp.next; // move forward
            }
        }

        return head;
    }
}