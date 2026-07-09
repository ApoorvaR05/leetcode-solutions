/*Given an n x n grid containing only values 0 and 1, where 0 represents water and 1 represents land, find a water cell such that its distance to the nearest land cell is maximized, and return the distance. If no land or water exists in the grid, return -1.
The distance used in this problem is the Manhattan distance: the distance between two cells (x0, y0) and (x1, y1) is |x0 - x1| + |y0 - y1|.
time & space: O(n^2)*/
class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        Queue<int[]> q = new LinkedList<>();

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    q.offer(new int[] {r,c});
                }
            }
        }

        if (q.size() == n * n || q.size() == 0) {
            return -1;
        }

        int[][] directions = {
            {-1,0}, {1,0}, {0,-1}, {0,1}
        };
        int distance = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            distance++;

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] dir: directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr < 0 || nc < 0 || nr >= n || nc >= n) {
                        continue;
                    }
                    if (grid[nr][nc] == 0) {
                        grid[nr][nc] = 1;
                        q.offer(new int[] {nr, nc});
                    }
                    
                }
            }
            
        }
        return distance;
    }
}
