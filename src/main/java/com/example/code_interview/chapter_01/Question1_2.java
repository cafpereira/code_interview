package com.example.code_interview.chapter_01;

/**
 * @author: cpereira
 */

public class Question1_2 {

    class Pointer {
        char c;
        Pointer next;
    }

    public void reverse(Pointer str) {
        Pointer prev = null;
        Pointer cur = str;

        while (cur.next != null) {
            Pointer tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
    }
}
