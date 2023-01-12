class Solution {
    public int arrangeCoins(int n) {
        long beg=1,last=n;
        while(beg<=last){
            long mid=beg+(last-beg)/2;
            if((mid*(mid+1)/2) == n)
               return (int)mid;
            else if((mid*(mid+1)/2) > n)
                last = mid-1;
            else
                beg=mid+1;
        }
        return (int)last;
    }
}