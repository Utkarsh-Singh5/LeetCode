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
    public ListNode reverseList(ListNode head) {

        ListNode temp=head;
        ListNode prev=null;

        if(head==null)
        {
            return head;
        }

        while(temp!=null)
        {
            ListNode nextemp=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextemp;
            
            
        }
        return prev;
    }
}