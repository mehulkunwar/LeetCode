package Easy;

import Utility.ListNode;

// Linked List Cycle
// Time Complexity - O(n)
// Space Complexity - O(1)

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }

        return false;
    }
}
