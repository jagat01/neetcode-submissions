/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l=0;
        int r=mountainArr.length()-1;
        int peakIndex=-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(mid==mountainArr.length()-1 || mountainArr.get(mid)>mountainArr.get(mid+1)){
                peakIndex=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

         l=0;
         r= peakIndex-1;
         while (l <= r) {
            int m = (l + r) / 2;
            int val = mountainArr.get(m);
            if (val < target) {
                l = m + 1;
            } else if (val > target) {
                r = m - 1;
            } else {
                return m;
            }
        }

        l = peakIndex;
        r = mountainArr.length() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int val = mountainArr.get(m);
            if (val > target) {
                l = m + 1;
            } else if (val < target) {
                r = m - 1;
            } else {
                return m;
            }
        }

        return -1;



        
    }
}