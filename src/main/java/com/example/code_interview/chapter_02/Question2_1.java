package com.example.code_interview.chapter_02;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: cpereira
 */
public class Question2_1 {

    public void removeDupes_v1(Node c) {
        Set set = new HashSet();
        set.add(c.value);

        while (c.next != null) {
            if (set.contains(c.next.value))
                c.next = c.next.next;
            else
                set.add(c.next.value);
            c = c.next;
        }
    }

    public void removeDupes_v2(Node c) {
        // No auxiliary table

        while (c.next != null) {
            Node runner = c;
            while (runner.next != null) {
                if (runner.next.value == c.value) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            c = c.next;
        }
    }
}
