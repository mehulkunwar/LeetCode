package Medium;

import Utility.ListNode;

public class LeetCode143 {
    public void reorderList(ListNode head) {
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode middleNode = reverseList(slow.next);
        slow.next = null;

        mergeLists(head,middleNode);
    }

    void mergeLists(ListNode l1, ListNode l2){

        while(l1 != null && l2 != null){
            ListNode t1 = l1.next;
            l1.next = l2;
            l1 = t1;

            ListNode t2 = l2.next;
            l2.next = l1;
            l2 = t2;
        }
    }

    ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
