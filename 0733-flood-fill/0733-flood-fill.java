class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prev=image[sr][sc];
        if(prev==color)
            return image;
        dfs(image,sr,sc,prev,color);
        return image;
    }
    void dfs(int image[][],int r,int c,int prev,int color)
    {
        
        if(r<0 || c<0 || r>=image.length || c>=image[0].length )
            return ;

        if (image[r][c] != prev)
        return;

        image[r][c]=color;

        dfs(image,r-1,c,prev,color);
        dfs(image,r+1,c,prev,color);
        dfs(image,r,c-1,prev,color);
        dfs(image,r,c+1,prev,color);

        // int rd[]={-1,1,0,0};
        // int cd[]={0,0,-1,1};
        // int tr=r;
        // int tc=c;
        // for(int i=0;i<4;i++)
        // {
        //     r=tr+rd[i];
        //     c=tc+cd[i];
        //     if(r>=0 && r<image.length&& c>=0&&c<image[0].length && image[r][c]==prev)
        //     {
        //         dfs(image,r,c,prev,color);
        //     }
        // }

        // if(r-1>=0 && image[r-1][c]==prev)
        //     dfs(image,r-1,c,prev,color);

        // if(r+1<image.length && image[r+1][c]==prev)
        //     dfs(image,r+1,c,prev,color);
        // if(c-1>=0 && image[r][c-1]==prev)
        //     dfs(image,r,c-1,prev,color);
        // if(c+1<image[0].length && image[r][c+1]==prev)
        //     dfs(image,r,c+1,prev,color);

        
    }
}