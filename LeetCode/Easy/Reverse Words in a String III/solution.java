class Solution {
    public String reverseWords(String s) {
        char [] arr=s.toCharArray();
        int st=0;

        for(int i=0; i<=arr.length; i++){
            if(i==arr.length || arr[i]==' '){
               int end=i-1;

                while(st<end){
                char temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;

                st++;
                end--;

                }
                st=i+1;
            }
        }
        return new String(arr);
    }
}