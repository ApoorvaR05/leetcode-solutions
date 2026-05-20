// Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. 

// Note: If multiple occurrences are there, please return the smallest index.
// Time: O(logn)
// Space: O(1)

class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        
        while (left <= right) {
            int mid = (left + right)/2;
            
            if (arr[mid] == k) {
                ans = mid;
                
                right = mid - 1;
            }
            else if (arr[mid] < k) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

// normal binary search is modified, if found middle go to left to find first occurence of the key
