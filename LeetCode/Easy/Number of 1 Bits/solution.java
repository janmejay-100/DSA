class Solution {
    public int hammingWeight(int n) {
        String bin=Integer.toBinaryString(n);
        int cnt=0;
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}