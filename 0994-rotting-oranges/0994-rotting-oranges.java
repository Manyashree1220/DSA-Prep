class Solution {
    public int orangesRotting(int[][] grid) {

        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int frs=0;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    frs++;
                }
            }
        }
        int rd[]={-1,0,0,1};
        int cd[]={0,-1,1,0};

        int min=0;

        while(!q.isEmpty() && frs>0)
        {
            int s=q.size();
            while(s>0)
            {
                int current[]=q.poll();
                int r=current[0];
                int c=current[1];

                for(int i=0;i<4;i++)
                {
                    int tr=r+rd[i];
                    int tc=c+cd[i];
                    if(tr>=0 && tr<row && tc>=0 && tc<col && grid[tr][tc]==1)
                    {
                        grid[tr][tc]=2;
                        q.offer(new int[]{tr,tc});
                        frs--;
                    }
                }
                s--;
            }
            min++;
        }
        if(frs>0)
            return -1;
        return min;
    }
    
}