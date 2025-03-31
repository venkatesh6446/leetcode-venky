class Solution {
    public boolean valid(int i, int j, int n, int m) {
        return i >= 0 && j >= 0 && i < n && j < m;
    }

    public int[] maxPoints(int[][] grid, int[] queries) {
        int n = grid.length, m = grid[0].length;
        int[] res = new int[queries.length];
        int[][] visited = new int[n][m];
        for (int[] row : visited) Arrays.fill(row, -1);
        PriorityQueue<int[]> minh = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        List<int[]> q = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) q.add(new int[]{queries[i], i});
        q.sort(Comparator.comparingInt(a -> a[0]));
        minh.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = 1;
        int[] dx = {0, 0, 1, -1}, dy = {1, -1, 0, 0};
        int count = 0;

        for (int[] query : q) {
            while (!minh.isEmpty() && minh.peek()[0] < query[0]) {
                count++;
                int[] cur = minh.poll();
                int x = cur[1], y = cur[2];
                for (int j = 0; j < 4; j++) {
                    int newx = x + dx[j], newy = y + dy[j];
                    if (valid(newx, newy, n, m) && visited[newx][newy] == -1) {
                        visited[newx][newy] = 1;
                        minh.offer(new int[]{grid[newx][newy], newx, newy});
                    }
                }
            }
            res[query[1]] = count;
        }
        return res;
    }
}