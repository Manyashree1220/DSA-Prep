class Solution {

    String[] phone={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        {
            return ans;
        }
        backtract(digits,0,"");
        return ans;
    }
    void backtract(String digits,int index, String current)
    {
        if(index==digits.length())
        {
            ans.add(current);
            return;
        }
        String letters = phone[digits.charAt(index)-'0'];

        for(int i=0;i<letters.length();i++)
        {
            char ch=letters.charAt(i);

            backtract(digits,index+1,current+ch);
        }
    }
}