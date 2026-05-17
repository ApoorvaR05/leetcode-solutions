// Given an array arr[] . Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
// Note: Consider the array as circular.
// Time: O(n)
// Space: O(1)

class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d % n;
        
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    
    static void reverse(int a[], int start, int end) {
        while (start <= end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
            start++;
            end--;
        }
    }

// Find the effective rotation using:
// d=dmodn
// Reverse the first d elements.
// Reverse the remaining n-d elements.
// Reverse the entire array.
// The array becomes left rotated by d positions.
}
