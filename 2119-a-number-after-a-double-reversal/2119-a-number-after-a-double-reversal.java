class Solution {
    public boolean isSameAfterReversals(int num) {
        int a=reverse(num);
        int b=reverse(a);
        if(b==num)
            return true;
        return false;

    }
    int reverse(int n)
        {
            int r=0;
            while(n>0){
            r=r*10+n%10;
            n=n/10;
            }
            return r;
        }
}