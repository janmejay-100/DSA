class Solution {
    public int majorityElement(int[] nums) {
        //Cheak-------
        int cand=0;
        int cnt=0;
        for(int x:nums){
            if(cnt==0){
                cand=x;
            }
            if(cand==x){
                cnt++;
            }else{
                cnt--;
            }
        }
        //Verify-----
        cnt=0;
        for(int x:nums){
            if(cand==x){
                cnt++;
            }
        }
        if(cnt>nums.length/2){
            return cand;
        }
        return -1;
    }
}