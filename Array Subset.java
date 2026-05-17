// Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[]. Count must also be matching
// Time: O(n + m)
// Space: O(n)

import java.util.*;
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int i:a) {
            freq.put(i, freq.getOrDefault(i,0) + 1);
        }
        
        for (int i:b) {
            if (!freq.containsKey(i) || freq.get(i) == 0) {
                return false;
            }
            freq.put(i, freq.get(i) - 1);
        }
        return true;
    }
}
// 1. Count the frequency of each element in array **a**.
// 2. Start checking each element in array **b** one by one.
// 3. For every element in **b**, verify whether it exists in the frequency map of **a**.
// 4. If an element is not present or its frequency becomes zero, conclude that **b is not a subset of a**.
// 5. If all elements of **b** are successfully verified, conclude that **b is a subset of a**.
