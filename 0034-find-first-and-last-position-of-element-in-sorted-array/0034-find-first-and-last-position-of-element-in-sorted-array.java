class Solution {
    static int leftbinarysearch(int arr[],int start,int end , int target){
        int min = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                min = Math.min(min,mid);
                end = mid-1;
            }
            else if (arr[mid]<target){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }


 static int rightbinarysearch(int arr[],int start,int end , int target){
        int max = Integer.MIN_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                max = Math.max(max,mid);
                start = mid+1;
            }
            else if (arr[mid]<target){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return (max==Integer.MIN_VALUE)?-1:max;
    }
    

    public int[] searchRange(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1;
        int left = leftbinarysearch(nums,start,end,target);
        int right = rightbinarysearch(nums,start,end,target);
        int arr[]= new int[2];
        arr[0]= left;
        arr[1]= right;
        return arr;

    }
}