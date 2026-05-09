
// TC: O(n)
// SC: O(1)
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            result.add(arr[k]);
        }
        
        return result;
    }
}

// What if I want to remove duplicates such that each element appears at most twice?" (e.g., [1,1,1,2,2,3] becomes [1,1,2,2,3]).

import java.util.*;

class Solution {
    public ArrayList<Integer> removeDuplicatesAtMostTwice(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;

        // If length is 2 or less, all elements are allowed regardless of duplicates
        if (arr.length <= 2) {
            for (int num : arr) result.add(num);
            return result;
        }

        // We use an in-place modification logic first, 
        // then convert the valid part to ArrayList
        int i = 2; // Start from the 3rd position
        for (int j = 2; j < arr.length; j++) {
            // Compare current element with the one two places back
            if (arr[j] != arr[i - 2]) {
                arr[i] = arr[j];
                i++;
            }
        }

        // Convert the modified part to ArrayList
        for (int k = 0; k < i; k++) {
            result.add(arr[k]);
        }
        
        return result;
    }
}
