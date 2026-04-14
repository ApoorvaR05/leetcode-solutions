// 88. Merge 2 sorted arrays (ascending) to a new ascending sorted array without using extra space. Already array 2 size elmenets are marked 0 in first array.
// Space: O(1)
// Time: O(m + n) size of both arrays

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // nums1 pointer
        int j = n - 1;          // nums2 pointer
        int k = m + n - 1;      // fill position

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        // If nums2 still has elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

// traversing from the back. Compares 2 elements each at the back of the arrays. The one with larger value will be kept at the back of the 1st array and changed arrays pointer changes (decreasing)
