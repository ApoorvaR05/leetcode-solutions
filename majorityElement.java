// 169 - Majority Element
// return the number which occurs more than n/2 times (most occuring)
// Space - O(1)
// Time - O(n)
// Boyer–Moore Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

// this solution when majority element is guranteed otherswise second pass required

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // 🔹 First Pass: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // 🔹 Second Pass: Verify candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return candidate;
        }
        return -1; // No majority element
    }
}
// Example (No Majority Case)

// Input: [1,2,3,4]

// Pass 1 → Candidate = 4 (just survives)
// Pass 2 → Count of 4 = 1

// 👉 1 <= 4/2 → Not majority
// 👉 Output = -1
