package com.example.code_interview.chapter_03;

import java.util.Stack;

/**
 * Created by cpereira on 17/03/15.
 */
public class Question3_6 {

    public Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> res = new Stack<Integer>();
        while (!s.isEmpty()) {
            Integer cand = s.pop();
            while (!res.isEmpty() && res.peek() > cand) {
                s.push(res.pop());
            }
            res.push(cand);
        }
        return res;
    }
}
