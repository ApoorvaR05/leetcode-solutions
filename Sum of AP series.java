// A series with same common difference is known as arithmetic series. The first term of series is 'a' and common difference is d. The series looks like a, a + d, a + 2d, a + 3d, . . . Find the sum of series upto nth term.
// Time & space: O(1)

class Solution {
    public int sumOfAP(int n, int a, int d) {
       
        if (n <= 0) {
            return 0;
        }
        
        return (n * (2*a + (n - 1) * d))/2;
    }
};

// direct Sn formula
