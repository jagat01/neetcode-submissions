class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxWater = 0;

        while(i<j){
            int height = Math.min(heights[i],heights[j]);
            int width = j-i;
            int water =height*width;
            maxWater = Math.max(maxWater,water);

            if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxWater;
        
    }
}
