class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(nums[pivot]== target)
            return true;
        if(nums[0]<=target)
            return binarySearch(nums,target,0,pivot);
        else
            return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return true;
        }
        return false;
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
        return arr.length-1;
    }
}