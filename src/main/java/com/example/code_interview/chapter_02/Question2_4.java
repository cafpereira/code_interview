package com.example.code_interview.chapter_02;

/**
 * @author: cpereira
 */
public class Question2_4 {
    Node[] h = new Node[2];
    Node[] t = new Node[2];

    public void partition(int x, Node n) {

        while (n != null) {
            Node next = n.next;
            int p = n.value < x ? 0:1;
            addPartition(p, n);
            n = next;
        }
    }

    private void addPartition(int p, Node n) {
        if (h[p] == null) h[p] = n;
        t[p].next = n;
        t[p] = n;
    }
}
