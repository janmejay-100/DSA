class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int maxdiff=0;
        int diff=0;
        for(int i=1; i<nums.length; i++){
            diff=nums[i]-nums[i-1];
            maxdiff=Math.max(maxdiff,diff);
        }
        return maxdiff;
    }
}