class Solution {
    public int mySqrt(int x) {
        int i=1,s=0;
        while(x>0)
        {
            x-=i;
            i+=2;
            s+=1;
        }
        if(x==0)
            return s;
        return s-1;
    }
}