// Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.
// TC: O(n)
// SC: O(1)

class Solution {
    public boolean isSorted(int[] arr) {
        if (arr == null || arr.length == 0)
            return false;
            
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
