package Utility;

public class ListNode{
    int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(ListNode next, int value) {
        this.next = next;
        this.value = value;
    }
}
