class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int dist=Integer.MAX_VALUE;

        // for(int i=0; i<nums.length; i++){
        //     int sum=0;
        //     for(int j=i; j<nums.length; j++){
        //         sum=sum+nums[j];

        //         if(sum>=target){
        //             dist=Math.min(dist,j-i+1);
        //             break;
        //         }
        //     }
        // }
        // return dist==Integer.MAX_VALUE ? 0:dist;

        int r=0;
        int l=0;
        int sum=0;
         while(r<nums.length){
            sum=sum+nums[r];
            while(sum>=target){
                dist=Math.min(dist,r-l+1);
                sum=sum-nums[l];
                l++;
            }
            r++;
         }
         return dist==Integer.MAX_VALUE ? 0 : dist;
    }
}