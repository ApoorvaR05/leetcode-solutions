/* You are given a permutation array A of size N.
Initially, students are standing at positions:
1 2 3 ... N
For every beat:
A student at position i moves to position A[i].
The movement continues repeatedly.

Find the minimum number of beats after which all students return to their original positions.
time & space:O(n)*/
import java.util.*;

public class Main {

    // GCD function
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // LCM function
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static long findBeats(int n, int[] board) {

        boolean[] visited = new boolean[n];

        long answer = 1;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                int current = i;
                int cycleLength = 0;

                // Detect cycle
                while (!visited[current]) {

                    visited[current] = true;
                    cycleLength++;

                    // board contains positions 1-based
                    current = board[current] - 1;
                }

                // Combine cycle length using LCM
                answer = lcm(answer, cycleLength);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] board = new int[n];

        for (int i = 0; i < n; i++) {
            board[i] = sc.nextInt();
        }

        System.out.println(findBeats(n, board));

        sc.close();
    }
}
