class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        bt(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    void bt(int cand[], int target, int st, List<Integer> curr, List<List<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList(curr));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=st;i<cand.length;i++)
        {
            if(i>st && cand[i]==cand[i-1])
                continue;
            if(cand[i]>target)
                break;
            curr.add(cand[i]);
            bt(cand,target-cand[i],i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}