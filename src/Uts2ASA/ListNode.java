package Uts2ASA;

public class ListNode {
    Object elemen;
    ListNode next;
    ListNode prev;

    public Object getElemen() {
        return elemen;
    }

    public ListNode() {
    }

    public ListNode(Object elemen) {
        this.elemen = elemen;
    }

    public ListNode(Object elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }
}
