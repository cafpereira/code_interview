package com.example.code_interview.chapter_02;

/**
 * @author: cpereira
 */
public class Question2_2 {

    public Node findKth(Node n, int k) {
        Node runner = n;

        for (int i = 0; i < k && runner != null; i++) {
            runner = runner.next;
        }
        while (runner != null){
            n = n.next;
            runner = runner.next;
        }
        return n;
    }
}
