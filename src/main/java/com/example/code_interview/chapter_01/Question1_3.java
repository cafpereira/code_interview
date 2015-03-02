package com.example.code_interview.chapter_01;

import java.util.Arrays;

/**
 * @author: cpereira
 */
public class Question1_3 {
    public boolean isPermutation(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        return sort(s1).equals(sort(s2));
    }

    public String sort(String s){
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
