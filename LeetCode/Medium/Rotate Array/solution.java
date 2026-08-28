class Solution {
    public void rotate(int[] nums, int k) {
        if(k%nums.length==0){
            return;
        }
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public void rev(int []arr, int st, int end){

        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;

            st++;
            end--;
        }
    }
}