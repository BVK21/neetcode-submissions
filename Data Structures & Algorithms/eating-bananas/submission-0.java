class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles == null || piles.length == 0 || h <= 0) return -1;

        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while(low < high){

        int totalHours = 0;
        int mid = ((high + low)/2);

        for( int pile : piles){
            totalHours += ((pile + (mid -1))/mid);
        }

        if(totalHours > h){
            low = mid+1;
        }else{
          high = mid;
        }
        
        
        
        }
        return low;
    }
}
