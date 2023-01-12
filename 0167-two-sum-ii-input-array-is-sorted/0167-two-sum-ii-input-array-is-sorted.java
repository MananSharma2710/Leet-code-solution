class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int last=numbers.length-1;
        for(int i=0;i<last;i++){
            int n=search(numbers,i+1,last,target-numbers[i]);
            if(n!=-1)
                return new int[]{i+1,n+1};
        }
        return new int[]{-1,-1};
    }
    int search(int[]nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}