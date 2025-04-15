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
    public ListNode removeElements(ListNode head, int val) {
        // First, skip all head nodes that need to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }

        // Now head is either null or a node with val != target
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Remove the node
            } else {
                current = current.next; // Move forward
            }
        }

        return head;
    }
}
