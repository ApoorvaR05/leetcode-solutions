/*Given an integer array nums containing n integers, find the beauty of each subarray of size k.
The beauty of a subarray is the xth smallest integer in the subarray if it is negative, or 0 if there are fewer than x negative integers.
Return an integer array containing n - k + 1 integers, which denote the beauty of the subarrays in order from the first index in the array.
A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input: nums = [1,-1,-3,-2,3], k = 3, x = 2
Output: [-1,-2,-2]
Explanation: There are 3 subarrays with size k = 3. 
The first subarray is [1, -1, -3] and the 2nd smallest negative integer is -1. 
The second subarray is [-1, -3, -2] and the 2nd smallest negative integer is -2. 
The third subarray is [-3, -2, 3] and the 2nd smallest negative integer is -2.
time and space: O(n), excluding output space: O(1)*/
class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] freq = new int[101];
        int left = 0;
        int[] ans = new int[nums.length - k + 1];
        int m = 0;

        for (int right = 0; right < nums.length; right++) {
            int idx = nums[right] + 50;
            freq[idx]++;

            if (right - left + 1 > k) {
                freq[nums[left] + 50]--;
                left++;
            }
            if (right - left + 1 == k) {
                int sum = 0;
              
                for (int j = 0; j < 50; j++) {
                    sum += freq[j];
                    if (sum >= x) {
                        ans[m] = j - 50;
                        m++;
                        break;
                    }
                }
                if (sum < x) {
                    ans[m] = 0;
                    m++;
                }
            }
        }
        return ans;
    }
}
