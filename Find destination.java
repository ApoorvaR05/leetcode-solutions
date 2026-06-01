// counts the number of ways to go from the top-left corner (0,0) of an n × n grid to the bottom-right corner (n-1,n-1), where you can only move:

// Right → (i, j+1)
// Down ↓ (i+1, j)
//   time: 2 ^ (m +n) to be reduced using DP

import java.util.Scanner;

public class Main {

    static int countWays(int i, int j, int n) {

        // Out of bounds
        if (i >= n || j >= n) {
            return 0;
        }

        // Reached destination
        if (i == n - 1 && j == n - 1) {
            return 1;
        }

        // Move right
        int rightWays = countWays(i, j + 1, n);

        // Move down
        int downWays = countWays(i + 1, j, n);

        // Total ways from current cell
        return rightWays + downWays;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grid size n: ");
        int n = sc.nextInt();

        int ways = countWays(0, 0, n);

        System.out.println("Total ways = " + ways);

        sc.close();
    }
}
