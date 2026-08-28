class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int c=0;
        int max=0;
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1 && !vis[i][j])
                {
                    c=dfs(grid,i,j,vis);
                    max=Math.max(c,max);
                }
                
            }
        }
        return max;
    }
    int dfs(int grid[][], int r,int c,boolean vis[][])
    {
        int area=1;
        vis[r][c]=true;
        int rd[]={-1,1,0,0};
        int cd[]={0,0,-1,1};
        for(int i=0;i<4;i++)
        {
            int tr=r+rd[i];
            int tc=c+cd[i];

            if(tr>=0 && tr< grid.length && tc>=0 && tc<grid[0].length && grid[tr][tc]==1 && !vis[tr][tc])
                area=area+dfs(grid,tr,tc,vis);
        }
        return area;
    }
}