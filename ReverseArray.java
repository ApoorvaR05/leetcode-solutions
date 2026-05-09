
// TC: O(n)
// SC: O(1)
// using in-place approach
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        if (arr == null || arr.length == 0)
            return;
            
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}

// using 2 pointer
class Solution {
    public void reverseArray(int arr[]) {
        if (arr == null || arr.length <= 1) return;
        
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers toward the center
            start++;
            end--;
        }
    }
}
