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
    public int[] nextLargerNodes(ListNode head) {
        
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }

        int ans[]=new int[c];
        int w=0;

        temp=head;

        while(temp!=null && w<c)
        {
            ListNode temp2=temp.next;
            int d=0;
            while(temp2!=null)
            {
                if(temp.val<temp2.val)
                {
                    ans[w++]=temp2.val;
                    d=1;
                    break;
                }
                else
                {
                    d=0;
                    temp2=temp2.next;
                }
                
            }
            if(d==0)
            {
                ans[w++]=0;
            }
            temp=temp.next;

        }return ans;
    }
}