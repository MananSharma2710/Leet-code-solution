class Solution {
    public int commonFactors(int a, int b) {
        int m,n,s=0;
        if(a>b)
        {
            m=a;
            n=b;
        }
        else
        {
            m=b;
            n=a;
        }
            
        for(int i=1;i<=n;i++)
        {
            if(m%i==0 && n%i==0)
                s++;
        }
        return s;
    }
}