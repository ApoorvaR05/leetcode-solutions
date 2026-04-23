# Searching the target and return index
# TC: O(log n)
# SC: O(1)


def binarySearch(nums, target):
  left = 0
  right = len(nums) - 1

while (left <= right):
  mid = (left + right) // 2
  if nums[mid] == target:
    return mid
  else if nums[mid] > target:
    right = mid - 1
  else
    left = mid + 1

return -1
