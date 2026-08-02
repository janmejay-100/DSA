class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int cnt=0;

        for(int i=n; i>=0;i--){
            char ch=s.charAt(i);

            if(ch!=' '){
                cnt++;
            }else if(cnt!=0){
                break;
            }
        }
        return cnt;
    }
}
