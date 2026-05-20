// Find the number of factors for a given integer n.
// time: O(sqrt n)
// space: O(1)

class Solution {
    static int countFactors(int n) {
        // code here
        if (n == 0 || n == 1) {
            return 1;
        }
        int count = 2;
        
        for (int i = 2; i * i <= n; i++) {
            
            if (n % i == 0) {
                
                if (n/i == i) {
                    count++;
                }
                else {
                    count += 2;
                }
                
            }
        }
        return count;
    }
}


// factors occur in pai, so if n factor by i, i/n is also factor, count 2 factors, except perfect square. Take that as one
