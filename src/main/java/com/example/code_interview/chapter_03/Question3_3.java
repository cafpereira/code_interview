package com.example.code_interview.chapter_03;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by cpereira on 17/03/15.
 */
public class Question3_3 {
    int n;
    Stack<Integer> A, B, C;

    public void init(int n) {
        A = new Stack<Integer>();
        B = new Stack<Integer>();
        C = new Stack<Integer>();

        for (int i = n; i > 0; i--) {
            A.push(i);
        }
        this.n = n;
    }

    public void move(int d, Stack<Integer> orig, Stack<Integer> dest, Stack<Integer> buf) {
        if (d > 0) {
            move(d - 1, orig, buf, dest);
            moveTop(orig, dest);
            move(d - 1, buf, dest, orig);
        }
    }

    private void moveTop(Stack<Integer> orig, Stack<Integer> dest) {
        dest.push(orig.pop());
    }

    public static void main(String[] args) {
        Question3_3 hanoi = new Question3_3();
        hanoi.init(4);
        hanoi.start();
        hanoi.print();
    }

    private void start() {
        move(n, A, C, B);
    }

    private void print() {
        for (Stack<Integer> s : Arrays.asList(A, B, C)){
            System.out.println("Stack: " + Arrays.toString(s.toArray()));
        }
    }
}
