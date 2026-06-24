class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int l = 1;
        int r = maxPile;
        int firstIndex=-1;
        while(l<=r){
            int mid = l +(r-l)/2;
            //now find the totalHours if it matches with h
            // Check if speed 'mid' is feasible (can finish within h hours)
            long totalHours = 0;
            for (int pile : piles) {
                totalHours += Math.ceil((double) pile / mid);;
            }
            if(totalHours<=h){
                firstIndex = mid;
                r=mid-1;
            }
            else{
             l= mid+1;
            }
        }
        return firstIndex;
    }
}
