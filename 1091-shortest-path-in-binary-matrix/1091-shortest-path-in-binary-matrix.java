class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1)
            return -1;

        int rd[]={1,-1,0,0,1,-1,1,-1};
        int cd[]={0,0,1,-1,1,1,-1,-1};

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0,0,1});
        grid[0][0]=1;

        while(!q.isEmpty())
        {
            int cur[]=q.poll();
            int r=cur[0];
            int c=cur[1];
            int d=cur[2];

            if(r==n-1 && c==n-1)
            {
                return d;
            }
            for(int i=0;i<8;i++)
            {
                int tr=r+rd[i];
                int tc=c+cd[i];

                if(tr>=0 && tr<n && tc>=0 && tc<n && grid[tr][tc]==0)
                {
                    grid[tr][tc]=1;
                    q.offer(new int[]{tr,tc,d+1});
                }
            }
        }
        return -1;
    }
}