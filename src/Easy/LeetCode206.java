package Easy;

// Reverse Linked List
// Time Complexity - O(n)
// Space Complexity - O(1)

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(ListNode next, int value) {
        this.next = next;
        this.value = value;
    }
}

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
