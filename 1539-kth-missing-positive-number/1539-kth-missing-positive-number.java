class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0,n=0;
        while(k!=0 && i<arr.length)
        {
            n++;
            if(arr[i]!=n)
            {
                k--;
            }
            else
            {
                i++;
            }
        }
        if(k==0)
            return n;
        return n+k;
    }
}