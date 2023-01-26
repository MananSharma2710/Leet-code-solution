class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=count(nums,nums[i]);
        }
        return ans;
    }
    int count(int[] arr, int am){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<am)
                c++;
        }
        return c;
    }
}