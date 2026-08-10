class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carr=0;
        while(i>=0 || j>=0 || carr>0){
            int digi1=0;
            int digi2=0;
            if(i>=0){
                digi1=num1.charAt(i)-'0';
            }
            if(j>=0){
                digi2=num2.charAt(j)-'0';
            }
            int sum=digi1+digi2+carr;
            carr=sum/10;
            sb.append(sum%10);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
