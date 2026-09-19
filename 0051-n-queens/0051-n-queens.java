class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans=new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        solve(0, board, ans, n);

        return ans;
    } 
    void solve(int row, char[][] board, List<List<String>> ans, int n)
    {
        if(row==n)
        {
            List<String> list = new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }

        for(int col=0;col<n;col++)
        {
            if(isSafe(board, row, col, n))
            {
                board[row][col] = 'Q';

                solve(row+1, board, ans, n);

                board[row][col] = '.';
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col, int n)
    {
        for(int i=0;i<row;i++)
        {
            if(board[i][col]=='Q')
                return false;
        }
        int r=row-1;
        int c=col-1;
        while(r>=0 && c>=0)
        {
            if(board[r][c]=='Q')
                return false;

            r--;
            c--;
        }

        r=row-1;
        c=col+1;

        while(r>=0 && c<n)
        {
            if(board[r][c]=='Q')
                return false;

            r--;
            c++;
        }

        return true;
        
    }

    
}