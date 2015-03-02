package com.example.code_interview.chapter_01;

/**
 * @author: cpereira
 */
public class Question1_1 {
    public boolean allUnique_v1(String str) {
        // O(n) time, extra space
        boolean charTable[] = new boolean[256];

        if (str.length() > 256) return false;

        for (int i = 0; i < str.length(); i++) {
            int index = (int) str.charAt(i);
            if (charTable[index]) { // Already found this char in string
                return false;
            }
            charTable[index] = true;
        }
        return true;
    }

    public boolean allUnique_v2(String str) {
        // O(n^2) time, no extra space

        //TODO compare every char with every other.
        return true;
    }
}
