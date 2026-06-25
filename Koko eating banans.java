/* Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
time: O(nlogn), space: O(1) */

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        int k = 0;

        for (int i = 1; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (canEat(piles, mid, h)) {
                k = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return k;
    }
    private boolean canEat (int[] piles, int speed, int h) {
        int currH = 0;
        for (int i = 0; i < piles.length; i++) {
            currH += Math.ceil((double)piles[i]/speed);
        }
        return currH <= h;
    }
}
