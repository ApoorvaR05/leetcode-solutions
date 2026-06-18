/*You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.
We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
time: O(n), space: O(k) */
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       int left = 0;
       long maxSum = 0;
       long sum = 0;
       HashMap<Integer, Integer> map = new HashMap<>();

       for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            if (right - left + 1 > k) {
                sum -= nums[left];
                map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                if (map.get(nums[left]) == 0) 
                    map.remove(nums[left]);
                left++;
            }
            if (right - left + 1 == k) {
                if (map.size() == k) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
       }
       return maxSum;
    }
}
