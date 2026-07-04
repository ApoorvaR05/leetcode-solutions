/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
time: O(n), space: O(1)*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s = (n * (n + 1)) / 2;
        int sum = 0;

        for (int num: nums) {
            sum += num;
        }
        return s - sum;
    }
}
// if overflow occurs in the range use long
/////
// this method handles overflow
class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }
}
