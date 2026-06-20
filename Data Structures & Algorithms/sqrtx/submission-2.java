class Solution {
    public int mySqrt(int x) {
        int l=0;
        int r=x;
        int res=-1;
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid == x / mid){
                return mid;
            }
            if(mid > x/mid){
                res = mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res-1;
    }
}