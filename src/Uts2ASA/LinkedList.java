package Uts2ASA;

import java.util.NoSuchElementException;

public class LinkedList {
    private ListNode head;
    int size;

    public int size() {
        return size;
    }

    public LinkedList() {
        size = 0;
        head = new ListNode();
        head.next = head;
        head.prev = head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode getHead() {
        return head;
    }

    private void addBefore(Object s, ListNode node) {
        ListNode baru = new ListNode(s);
        baru.next = node;
        baru.prev = node.prev;
        node.prev.next = baru;
        node.prev = baru;
        size++;
    }

    public void addFirst(Object elemen) {
        addBefore(elemen, head.next);
    }

    public void addLast(Object elemen) {
        addBefore(elemen, head);
    }

    private Object remove(ListNode node) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        return node.elemen;
    }

    public Object removeFirst() {
        return remove(head.next);
    }

    public Object removeLast() {
        return remove(head.prev);
    }

    @Override
    public String toString() {
        ListNode node = head.next;
        StringBuilder kalimat = new StringBuilder("( ");
        while (node != head) {
            kalimat.append(node.elemen);
            node = node.next;
            if (node != head) {
                kalimat.append(" ");
            }
        }
        kalimat.append(" )");
        return kalimat.toString();
    }

    public void print() {
        ListNode node = head.next;
        while (node != head) {
            System.out.println(node.elemen);
            System.out.println("    ");
            node = node.next;
        }
    }

    public ListNode search(String judul) {
        ListNode node = head.next;
        while (node != head) {
            Buku buku = (Buku) node.elemen;
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
