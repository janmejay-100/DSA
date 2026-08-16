class Solution {
    public int findNumbers(int[] nums) {
       int cnt=0;
       for(int x: nums){
        int digi=0;
        while(x>0){
            digi++;
            x=x/10;
        }
        if(digi%2==0){
            cnt++;
        }
       }
       return cnt;
    }
}
