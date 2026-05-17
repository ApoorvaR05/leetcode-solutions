// Given an array arr. Determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right.
// If there are no elements to the left/right, then the sum is considered to be zero. 
// Time: O(n)
// Space: O(1)

class Solution {
    String equilibrium(int arr[]) {
        // code here
        int totalSum = 0;
        int leftSum = 0;
        
        for(int i:arr) {
            totalSum += i;
        }
        
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            
            if (totalSum == leftSum) {
                return "true";
            }
            
            leftSum += arr[i];
        }
        return "false";
    }
}
