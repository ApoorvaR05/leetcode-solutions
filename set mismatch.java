/*You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
time: O(n), space: O(1) */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length) {
            int idx = nums[i] - 1;
            if (nums[i] != nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
            else {
                i++;
            }
        }
        i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                ans[0] = nums[i];
                ans[1] = i + 1;
                break;
            }
            i++;
        }
        return ans;
    }
}
