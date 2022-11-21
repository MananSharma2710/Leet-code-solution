class Solution {
    public int arrangeCoins(int n) {
        int i=1,s=0;
        while(n>=i)
        {
            n-=i;
            i+=1;
            s+=1;
        }
        return s;
    }
}