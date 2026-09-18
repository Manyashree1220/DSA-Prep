class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        boolean[] freq=new boolean[nums.length];
        bt(nums, list, res, freq);
        return res;
    }

    void bt(int[] nums,List<Integer> list, List<List<Integer>> res,boolean[] freq)
    {
        if(list.size()==nums.length)
        {
            res.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                list.add(nums[i]);
                bt(nums,list,res,freq);
                list.remove(list.size()-1);
                freq[i]=false;
            }
        }
    }
}