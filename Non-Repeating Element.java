// Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0

// Note: The array consists of only positive and negative integers and not zero.
// time & space: O(n)

class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }
}
