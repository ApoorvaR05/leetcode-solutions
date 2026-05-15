// Given an array arr[] consisting of only 0’s and 1’s, return count of the maximum number of consecutive 1’s or 0’s present in the array. 
//   TC: O(n)
//   SC: O(1)

class Solution {
    public int maxConsecBits(int[] arr) {

        int maxCount = 1;
        int currentCount = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                currentCount++;
            }
            else {
                currentCount = 1;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
        
    }
}
