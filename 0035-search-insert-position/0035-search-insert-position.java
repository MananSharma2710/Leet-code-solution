class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg=0;
        int last= nums.length-1;
        while(beg<=last)
        {
            int mid=beg+(last-beg)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                last=mid-1;
            else
                beg=mid+1;
        }
        return beg;
    }
}