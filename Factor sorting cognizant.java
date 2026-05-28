/*
Problem Statement

Given an integer N, your task is to find and print all the factors of the number in ascending order.

A factor of a number is a value that divides the number exactly without leaving any remainder.

The program should also handle negative inputs by considering their absolute value.

Input Specification
input1: An integer N.
Output Specification

Print all factors of N in ascending order separated by commas.

Constraints
-10^9 <= N <= 10^9
N ≠ 0
Complexity	Value
Time	O(√n + k log k)  ( klogn for sorting)
Space	O(k)
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Math.abs(sc.nextInt());

        if(n == 0) return;

        int[] arr = new int[n];
        int j = 0;

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {

                arr[j++] = i;

                if(i != n / i) {
                    arr[j++] = n / i;
                }
            }
        }

        int[] a = Arrays.copyOf(arr, j);

        Arrays.sort(a);

        for(int x : a) {
            System.out.println(x);
        }

        sc.close();
    }
}
