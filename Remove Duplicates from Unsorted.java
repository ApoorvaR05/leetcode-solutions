// Given an array arr[] of integers which may or may not contain duplicate elements. Your task is to remove duplicate elements. Your result should have elements according their first appearance in the input array.

// time & space: O(n)

class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                list.add(arr[i]);
                set.add(arr[i]);
            }
        }
        return list;
    }
}
