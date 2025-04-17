class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        // Base case: empty list or single node
        if (head == null || head.next == null) 
        {
            return head;
        }

        ListNode previous = null;
        ListNode current = head;

        while (current != null) 
        {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
