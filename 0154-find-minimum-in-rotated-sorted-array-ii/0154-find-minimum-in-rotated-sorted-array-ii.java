class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if(pivot+1 == nums.length)
            return nums[0];
        return nums[pivot+1];
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            else if (mid> start && arr[mid]< arr[mid-1])
                return mid-1;
            if(arr[start]== arr[mid] && arr[mid]== arr[end]){
                if(start<arr.length-1 && arr[start]>arr[start+1])
                    return start;
                start++;
                if (end>0 && arr[end]<arr[end-1])
                    return end;
                end--;
            }else if (arr[mid]>arr[start] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else
                end=mid-1;
        }
        return -1;
    }
}