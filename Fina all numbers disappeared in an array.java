/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
time: O(n), space: O(1) */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int idx = nums[i] - 1;
            if (nums[idx] == nums[i]) {
                i++;
            }
            else {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                list.add(j + 1);
            }
        }
        return list;
    }
}
