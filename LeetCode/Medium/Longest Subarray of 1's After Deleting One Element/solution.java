class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int right=0;
        int ans=0;
        int zerocnt=0;
        while(right<nums.length){
            if(nums[right]==0){
                zerocnt++;
            }
            while(zerocnt>1){
                if(nums[left]==0){
                    zerocnt--;
                }
                left++;
            }
            ans=Math.max(ans,right-left);
            right++;
        }
        return ans;
        
    }
}