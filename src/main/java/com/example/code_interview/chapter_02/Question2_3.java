package com.example.code_interview.chapter_02;

/**
 * @author: cpereira
 */
public class Question2_3 {


    public void delete(Node n) {
        if (n == null) return;

        while (n.next != null) {
            Node next = n.next;
            n.value = next.value;
            n.next = next.next;
            n = next;
        }
        finalize(n);
    }

    private void finalize(Node n) {
    // TODO
    }
}
