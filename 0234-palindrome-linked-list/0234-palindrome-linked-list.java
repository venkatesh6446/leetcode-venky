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
    public boolean isPalindrome(ListNode head) 
    { 
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Find middle using fast and slow pointers
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            // return slow 
        }
     
        // Step 2: Reverse the second half starting from slow (middle)
        ListNode secondHalfStart = reverseList(slow);

        // Step 3: Compare the two halves
        ListNode firstHalf = head;
        ListNode secondHalf = secondHalfStart;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // helper function to reverse the list from slow to last 
    // reversing the linked list follows 4 key points 
    /*
    1. remove the connection 
    2. add new connection 
    3. update the previous 
    4. update the head 
    */
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        while (head != null)
        {
            // step1:
            ListNode nexthead = head.next;
            head.next = prev;      // step2
            prev = head;           // step3
            head = nexthead;       // step4
        }
        return prev;
    }
}
