class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        bt(candidates, target,0,new ArrayList<>(),res);
        return res;
    }
    void bt(int[] can,int target,int st,List<Integer> curr, List<List<Integer>> res)
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
        for(int i=st;i<can.length;i++)
        {
            curr.add(can[i]);
            bt(can, target-can[i],i,curr,res);
            curr.remove(curr.size()-1);
        }
        //return res;
    }
}