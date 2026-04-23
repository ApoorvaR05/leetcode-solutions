# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# TC: O(1)
# SC: O(n) to store all elements in hashmap

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hash_map = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in hash_map:
                return [hash_map[complement], i]
            hash_map[num] = i
        return []

#   Loop through the array once.

# For each number num, compute:
# complement = target - num
# Check if this complement was already seen (stored in a hash map).
# ✅ If yes → return the indices.
# ❌ If no → store the current number with its index.
