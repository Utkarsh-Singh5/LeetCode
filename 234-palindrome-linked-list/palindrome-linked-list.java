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
    public boolean isPalindrome(ListNode head) {
        
        ListNode dummy = new ListNode(0); // dummy node
        ListNode tail = dummy;            // to build new list
        ListNode cu = head;

        while (cu != null) {
            tail.next = new ListNode(cu.val); // create new node
            tail = tail.next;                  // move tail
            cu = cu.next;                  // move original
        }
        ListNode rev=dummy.next;
        
        
        
        ListNode prev=null;
        ListNode temp=head;
        
        if(head==null || head.next==null) 
        {
            return true;

        }
            while(temp!=null)
            {
                ListNode curr=temp.next;
                temp.next=prev;
                prev=temp;
                temp=curr;
            }

            boolean ispal=false;
           while(prev!=null && rev!=null)
           {
            if(prev.val==rev.val)
            {
                ispal=true;
                prev=prev.next;
                rev=rev.next;
                
            }
            else
            {
                ispal=false;
                break;
            }
           
           }
            return ispal;
    }
}