class Solution {
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

    public List<List<Integer>> pacificAtlantic(int[][] h) {
        int m = h.length, n = h[0].length;
        boolean[][] pac = new boolean[m][n], atl = new boolean[m][n];
        for (int i = 0; i < m; i++) { dfs(h, pac, i, 0); dfs(h, atl, i, n-1); }
        for (int j = 0; j < n; j++) { dfs(h, pac, 0, j); dfs(h, atl, m-1, j); }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pac[i][j] && atl[i][j]) res.add(Arrays.asList(i, j));
        return res;
    }

    void dfs(int[][] h, boolean[][] vis, int r, int c) {
        vis[r][c] = true;
        for (int[] d : dirs) {
            int nr = r + d[0], nc = c + d[1];
            if (nr < 0 || nr >= h.length || nc < 0 || nc >= h[0].length || vis[nr][nc] || h[nr][nc] < h[r][c]) continue;
            dfs(h, vis, nr, nc);
        }
    }
}
