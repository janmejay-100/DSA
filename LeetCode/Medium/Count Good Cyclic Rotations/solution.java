class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int half=n/2;

        long totalsum=0;
        long fsum=0;
        for(int x:nums){
            totalsum+=x;
        }

        for(int i=0; i<half; i++){
            fsum+=nums[i];
        }

        int cnt=0;
        for(int i=0; i<n; i++){
            long ssum=totalsum-fsum;

            if(fsum>ssum){
                cnt++;
            }
            fsum=fsum-nums[i]+nums[(i+half)%n];
        }
        return cnt;
    }
}