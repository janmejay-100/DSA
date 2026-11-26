class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int x:piles){
            high=Math.max(high,x);
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            long t_hour=0;
            for(int x:piles){
                t_hour+=(x+(long)mid-1)/mid;
            }
            if(t_hour<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}