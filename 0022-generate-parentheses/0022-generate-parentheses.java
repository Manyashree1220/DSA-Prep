class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtract("",0,0,n);
        return ans;
    }
    void backtract(String s,int open, int close, int n)
    {
        if(s.length()==2*n)
        {
            ans.add(s);
            return;
        }
        if(open<n)
            backtract(s + "(", open+1,close,n);

        if(close<open)
            backtract(s + ")",open, close+1, n);
    }
}