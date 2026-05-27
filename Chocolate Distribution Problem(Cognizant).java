// Problem Statement
// You are organizing a charity event in a village, where you distribute chocolates to children sitting in a circle.

// The distribution of chocolates follows these rules based on each child’s position in the circle:

// The i-th child receives i chocolates.
// If a child’s position is adjacent to a multiple of 5, they receive an additional 2 chocolates.
// Given the number of children in a circle, your task is to calculate and return the total number of chocolates distributed.

// Note: Return the result modulo 1e9+7 to handle overflow.

// Input Specification
// input1: An integer value N, representing the number of children.

// time & space: O(1)

import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long MOD = 1000000007L;

        long base = ((long)n * (n + 1)) / 2;

        long extra = (n / 5) * 4L;

        long sum = (base + extra) % MOD;  // used MOD beacause ques mentions it

        System.out.println(sum);
    }
}

// If arithmetic may exceed int range:

// convert at least one operand to long
// BEFORE multiplication happens.
