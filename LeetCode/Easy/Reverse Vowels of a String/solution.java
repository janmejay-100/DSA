class Solution {
    public String reverseVowels(String s) {
       char [] arr=s.toCharArray();
       String vol="AEIOUaeiou";
       int st=0;
       int end=arr.length-1;
    while(st<end){
        while(st<end && vol.indexOf(arr[st])==-1){
            st++;
        }
        while(st<end && vol.indexOf(arr[end])==-1){
            end--;
        }
        char temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        st++;
        end--;
    }
    return new String(arr);
    }
}
