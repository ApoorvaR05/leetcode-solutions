/*Given:
Two strings:

A = original string
B = target string

You have one operation:

Pick any group of indices from the current string.
Look at the characters selected.
Find the smallest alphabet character among them.
Change all selected characters into that smallest character.

You need:

Minimum number of such operations required to convert A into B. */

import java.util.*;

public class Main {

    public static int minMoves(int n, String A, String B) {

        // Characters available initially in A
        boolean[] present = new boolean[26];

        for (char c : A.toCharArray()) {
            present[c - 'a'] = true;
        }

        Set<Character> moves = new HashSet<>();

        for (int i = 0; i < n; i++) {

            char a = A.charAt(i);
            char b = B.charAt(i);

            // Cannot increase a character
            if (a < b) {
                return -1;
            }

            // Target character must exist in original string
            if (!present[b - 'a']) {
                return -1;
            }

            // This target character requires one operation
            if (a != b) {
                moves.add(b);
            }
        }

        return moves.size();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        System.out.println(minMoves(n, A, B));

        sc.close();
    }
}
