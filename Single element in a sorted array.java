/* You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.
Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
time: O(logn), space: O(1) */
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low)/2;
            
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            }
            else {
                high = mid;
            }
        }
        return nums[low];
    }
}
/* 1 1 2 2 3 3 4 5 5

0 1 2 3 4 5 6 7 8

Before 4:
even index matches next

After 4:
even index does not match next. 
If there is no single element duplicates will start from even index */
