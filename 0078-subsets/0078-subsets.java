class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        bt(0,nums,new ArrayList<>(),res);
        return res;
    }
    static void bt(int start,int[] nums,ArrayList<Integer> current,List<List<Integer>> res)
    {
        res.add(new ArrayList(current));
        for(int i=start;i<nums.length;i++)
        {
            current.add(nums[i]);
            bt(i+1,nums,current,res);
            current.remove(current.size()-1);
        }
    }
}