class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        
        bt(nums, 0, new ArrayList<>(), res);
        return res;
    }
    void bt(int[] nums,int st,List<Integer> cur, List<List<Integer>> res)
    {
        res.add(new ArrayList<>(cur));
        for(int i=st;i<nums.length;i++)
        {
            if(i!=st && nums[i]==nums[i-1])
                continue;
            cur.add(nums[i]);
            bt(nums,i+1,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}