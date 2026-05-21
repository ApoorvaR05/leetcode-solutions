// You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

// Note : A subarray is a continuous part of an array.

// time: O(n)
// space: O(1)

class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = arr[0];
        int currSum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            
            currSum = Math.max(arr[i], arr[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
