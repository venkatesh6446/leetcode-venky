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
import java.util.*;
class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        
        
        ListNode previous=head;
        ListNode current=head.next; 
        while(current!=null)
        {
            ListNode next=current.next;
            current.next=previous;    // core step

            // updating ....
            previous=current;
            current=next;
        }
        head.next=null;
        head=previous;

        return head;
    }
}