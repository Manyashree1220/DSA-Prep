class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;

        boolean pac[][] = new boolean[m][n];
        boolean alt[][] = new boolean[m][n];

        // Pacific
        for(int j = 0; j < n; j++)
            dfs(0, j, heights, pac);

        for(int i = 0; i < m; i++)
            dfs(i, 0, heights, pac);

        // Atlantic
        for(int j = 0; j < n; j++)
            dfs(m - 1, j, heights, alt);

        for(int i = 0; i < m; i++)
            dfs(i, n - 1, heights, alt);

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                // Must reach BOTH oceans
                if(pac[i][j] && alt[i][j])
                {
                    res.add(Arrays.asList(i, j));
                }
            }
        }

        return res;
    }

    void dfs(int r, int c, int[][] heights, boolean[][] vis)
    {
        // 1. Boundary check
        if(r < 0 || c < 0 ||
           r >= heights.length ||
           c >= heights[0].length)
        {
            return;
        }

        // 2. Already visited
        if(vis[r][c])
            return;

        vis[r][c] = true;

        // Up
        if(r - 1 >= 0 &&
           heights[r - 1][c] >= heights[r][c])
        {
            dfs(r - 1, c, heights, vis);
        }

        // Down
        if(r + 1 < heights.length &&
           heights[r + 1][c] >= heights[r][c])
        {
            dfs(r + 1, c, heights, vis);
        }

        // Left
        if(c - 1 >= 0 &&
           heights[r][c - 1] >= heights[r][c])
        {
            dfs(r, c - 1, heights, vis);
        }

        // Right
        if(c + 1 < heights[0].length &&
           heights[r][c + 1] >= heights[r][c])
        {
            dfs(r, c + 1, heights, vis);
        }
    }
}