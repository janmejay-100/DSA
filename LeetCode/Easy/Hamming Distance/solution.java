class Solution {
    public int hammingDistance(int x, int y) {
       int cnt=0;
       int n=x^y;
       while(n>0){
        cnt=cnt+(n&1);
        n=n>>1;
       }
       return cnt;
    }
}