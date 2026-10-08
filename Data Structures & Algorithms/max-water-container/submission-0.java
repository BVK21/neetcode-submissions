class Solution {
    public int maxArea(int[] heights) {
        int i = 0 , j = heights.length - 1;
        int max = Integer.MIN_VALUE;
        while (i < j ){
            int area = (Math.min(heights[j] , heights[i]) * (j - i));
            max = Math.max(area , max);

            if(heights[i] < heights[j]){
               i++;
            }else{
                j--;
            }
        }

        return max;
    }
}
