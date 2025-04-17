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
    public ListNode reverseBetween(ListNode head, int l, int r) 
    { 
        // converting linked list to array list 
       List<ListNode>obj=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null)
       {
            obj.add(temp);
            temp=temp.next;
       }

       // 
       l=l-1;
       r=r-1;
       while(l<r)
       {
        int t=obj.get(l).val;
        obj.get(l).val=obj.get(r).val;
        obj.get(r).val=t;
        l++;
        r--;
       }
       return head;
    }



    
}
