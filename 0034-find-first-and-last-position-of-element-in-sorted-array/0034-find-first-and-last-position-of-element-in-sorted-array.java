class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0] = binarySearch(nums,target,true);
        ans[1] = binarySearch(nums,target,false);
        return ans;
    }
    int binarySearch(int[] arr,int target,boolean asec){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                if(asec)
                    end = mid-1;
                else
                    start = mid+1;
            }else if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        return ans;
    }
}