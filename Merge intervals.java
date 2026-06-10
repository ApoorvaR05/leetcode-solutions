/* Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Sorting: O(n log n)
Merging: O(n)
Total time: O(n log n)
Space: O(n) */

import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        for (int[] interval: intervals) {
            if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            }
            else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]); 
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
/*
Merge Intervals - Logic in Points
Sort all intervals by their start value (ascending order).
This ensures that any overlapping intervals will appear next to each other.
Create an empty result list to store merged intervals.
Traverse the sorted intervals one by one.
For each interval:
If the result list is empty, add the interval directly.
Otherwise, compare the current interval with the last interval in the result list.
Check for overlap:
If the current interval's start is less than or equal to the last merged interval's end, they overlap.
Merge them by:
Keeping the smaller start (already present in the last merged interval because of sorting).
Updating the end to the maximum of the two end values.
If there is no overlap:
Add the current interval as a new interval in the result list.
Continue until all intervals are processed.
Return the result list as the final set of merged intervals. */
