class Solution {
    public int singleNonDuplicate(int[] nums) {
        return search(nums,0,nums.length-1);
    }
    int search(int[] arr, int start, int end){
        while(start<=end){
            int mid=start + (end-start)/2;
            if(mid>0 && mid<end-1 && arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])
                return arr[mid];
            if(start<end-1 && arr[start]!=arr[start+1])
                return arr[start];
            if(end>0 && arr[end]!=arr[end-1])
                return arr[end];
            start +=2;
            end -=2;
        }
        return arr[0];
    }
}