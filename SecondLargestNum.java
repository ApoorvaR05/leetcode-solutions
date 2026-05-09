// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
// Note: The second largest element should not be equal to the largest element.
// TC: O(n)
// SC: O(1)

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int maxSec = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxSec = max;
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > maxSec) {
                maxSec = arr[i];
            }
        }
       
        return maxSec;
    }
}
