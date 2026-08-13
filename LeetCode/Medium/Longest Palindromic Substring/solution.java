class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0; i<s.length(); i++){
            String odd=valid(s,i,i);
            String even=valid(s,i,i+1);
            if(even.length()>ans.length()){
                ans=even;
            }
            if(odd.length()>ans.length()){
                ans=odd;
            }
        }
       return ans; 
    }
    public String valid(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}