package Easy;

// Reverse Linked List
// Time Complexity - O(n + m)
// Space Complexity - O(1)

public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;

        while(l1 != null && l2 != null){
            if(l1.value <= l2.value){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if(l1 != null) curr.next = l1;
        if(l2 != null) curr.next = l2;

        return head.next;
    }
}
