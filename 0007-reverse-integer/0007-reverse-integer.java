class Solution {
    public int reverse(int x) {
        long rem,sum=0;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(sum <= Integer.MAX_VALUE && sum >= Integer.MIN_VALUE)
            return (int)sum;
        return 0;
    }
}