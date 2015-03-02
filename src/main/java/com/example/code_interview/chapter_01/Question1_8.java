package com.example.code_interview.chapter_01;

/**
 * @author: cpereira
 */
public class Question1_8 {
    public boolean isRotation(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        String concat = s2 + s2;
        return isSubstring(concat, s1);
    }

    private boolean isSubstring(String str, String test) {
        // TODO New method
        return false;
    }
}
