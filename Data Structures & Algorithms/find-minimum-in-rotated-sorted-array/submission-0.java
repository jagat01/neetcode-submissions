class Solution {
    public int findMin(int[] nums) {
     int l=0;
     int size = nums.length;
     int r=size-1;
     int boundryIndex=-1;
     while(l<=r){
        int mid= l + (r-l)/2;
        if(nums[mid]<=nums[size-1]){
            boundryIndex = nums[mid];
            r=mid-1;
        }
        else{
            l=mid+1;
        }
     }
     return boundryIndex ;  
    }
}
