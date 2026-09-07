class Solution {
    int i=0;
    public void reverseString(char[] s) {
        // for(int i=0;i<s.length/2;i++)
        // {
        //     char temp=s[i];
        //     s[i]=s[s.length-1-i];
        //     s[s.length-1-i]=temp;
        // }
        
        if(i>=s.length/2)
            return;
        char temp=s[i];
        s[i]=s[s.length-1-i];
        s[s.length-1-i]=temp;

        i++;
        reverseString(s);
        
    }
}