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

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Step 1: Store nodes into a list
        List<ListNode> nodes = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = temp.next;
        }

        // Step 2: Convert left/right to 0-based
        int l = left - 1;
        int r = right - 1;

        // Step 3: Swap values between l and r
        while (l < r) {
            int t = nodes.get(l).val;
            nodes.get(l).val = nodes.get(r).val;
            nodes.get(r).val = t;
            l++;
            r--;
        }

        return head;
    }
}
