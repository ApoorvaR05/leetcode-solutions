/*You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
time & space: O(n^2) */
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 2) {
                    q.offer(new int[] {r,c});
                }
                else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }
        int[][] directions = {
            {-1,0}, {1, 0},
            {0,-1}, {0,1}
        };
        if (fresh == 0) {
            return 0;
        }

        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottedNow = false;

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] dir:directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fresh--;
                        q.offer(new int[] {nr, nc});
                        rottedNow = true;
                    }
                }
            }
            if (rottedNow) {
                time++;
            }
        }
        return fresh == 0 ? time : -1;
    }
}
