class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length-1;
        k=k%(n+1);
        nums=swap(nums,0,n-k);
        nums=swap(nums,n-k+1,n);
        nums=swap(nums,0,n);
        System.out.println(Arrays.toString(nums));
    }

    static int[] swap(int[] nums, int start, int end) {
        while (start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
    
}