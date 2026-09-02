class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums2.length;
        int[] res=new int[nums1.length];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty() && nums2[i]>=st.peek())
            {
                st.pop();
            }
            map.put(nums2[i],st.empty()? -1: st.peek());
            st.push(nums2[i]);
            
        }
        for(int i=0;i<nums1.length;i++)
        {
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}