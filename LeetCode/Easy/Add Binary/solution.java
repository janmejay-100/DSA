class Solution {
    public String addBinary(String a, String b) {
        if(a.length()<b.length()){
            return addBinary(b,a);
        }

        int m=a.length();
        int n=b.length();
        StringBuilder res=new StringBuilder();
        int j=n-1;
        int carr=0;
        for(int i=m-1; i>=0; i--,j--){
            int sum=carr;
            if(a.charAt(i)=='1'){
                sum=sum+1;
            }
            if(j>=0 && b.charAt(j)=='1'){
                sum=sum+1;
            }
            res.append(sum%2);
            carr=sum/2;
        }
        if(carr==1){
            res.append(1);
        }
        res.reverse();
        return res.toString();
    }
}