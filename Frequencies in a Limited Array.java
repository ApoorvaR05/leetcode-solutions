// You are given an array arr[] containing positive integers. The elements in the array arr[] range from  1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your have to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).
// time & space: O(n)

class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        List<Integer> list = new ArrayList<>(Collections.nCopies(n,0));
        
        for (int i = 0; i < n; i++) {
            list.set(arr[i] - 1, list.get(arr[i] - 1) + 1);
            // list.set(index, get value at index + 1)
        }
        return list;
    }
}
