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
    public ListNode partition(ListNode head, int x) {
        ListNode temp= new ListNode(-1);
        ListNode temp1= new ListNode(-1);
        ListNode head1= temp;
        ListNode head2= temp1;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val<x)
            {
                
                temp.next=curr;
                temp=temp.next;
            }
            else
            {
                temp1.next=curr;
                temp1=temp1.next;

            }
            curr=curr.next;
        }

        //merging
        temp.next=head2.next;

        //avoid cycle

        temp1.next=null;

        return head1.next;
        
    }
}