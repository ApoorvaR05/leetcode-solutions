// Given an array arr of N integers, the task is to replace each element of the array by its rank in the array. The rank of an element is defined as the distance between the element with the first element of the array when the array is arranged in ascending order. If two or more are same in the array then their rank is also the same as the rank of the first occurrence of the element. 

// time: O(nlogn)
// space: O(n)

// User function Template for Java
import java.util.*;

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int[] original = arr.clone();
        Arrays.sort(arr);   // Dual Pivot QuickSort used- O(nlogn)   nlogn > n
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], map.size() + 1);
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            original[i] = map.get(original[i]);
        }
        return original;
    }
}

/*
1. Create a copy of the original array to preserve initial order.

2. Sort the array in ascending order.

3. Traverse the sorted array.

4. Assign ranks to elements:

   * if element appears first time, assign next rank
   * if duplicate element appears, keep same rank

5. Store element → rank mapping in a HashMap.

6. Traverse the original array copy.

7. Replace each element with its corresponding rank from the HashMap.

8. Return the modified array containing ranks.
*/
