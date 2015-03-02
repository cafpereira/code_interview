package com.example.code_interview.chapter_01;

/**
 * @author: cpereira
 */
public class Question1_6 {

    private static final int N = 10;

    public void rotate_v1(int[][] matrix) {
        // Extra space O(n^2)
        int[][] rotation = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotation[j][N - i - 1] = matrix[i][j];
            }
        }
    }

    public void rotate_v2(int[][] matrix) {
        // In-place rotation, no extra space
        for (int layer = 0; layer < N / 2; layer++) {
            int corner = N - layer - 1;
            for (int i = layer; i < corner; i++) {
                int carry = matrix[layer][i];
                carry = shift(matrix, carry, layer, corner);
                carry = shift(matrix, carry, corner, corner);
                carry = shift(matrix, carry, corner, layer);
                matrix[layer][i] = carry;
            }
        }
    }

    private int shift(int[][] matrix, int val, int i, int j) {
        int carry = matrix[i][j];
        matrix[i][j] = val;
        return carry;
    }
}
