class Solution {
    public void rearrange(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int temp[]=new int[n];
        int left=0;
        int j=0;
        int right=arr.length-1;
        while(left<=right){
            temp[j++]=arr[right--];
            
            if(left<=right){
                temp[j++]=arr[left++];
            }
        }
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
    }
}
