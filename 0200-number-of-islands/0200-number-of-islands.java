class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        boolean vis[][] =new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    dfs(grid,i,j,vis);
                    c++;
                }
            }
        }
        return c;
    }
    void dfs(char grid[][], int r,int c,boolean vis[][])
    {
        vis[r][c]=true;
        int rd[]={-1,1,0,0};
        int cd[]={0,0,-1,1};
        for(int i=0;i<4;i++)
        {
            int tr=r+rd[i];
            int tc=c+cd[i];
            if(tr>=0 && tr<grid.length && tc>=0 && tc<grid[0].length && grid[tr][tc]=='1' && !vis[tr][tc])
                dfs(grid,tr,tc,vis);
        }
    }
}