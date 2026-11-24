class Solution {
    void nextPermutation(int[] arr) {
        int n=arr.length;
        int i=n-2;
        
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            
            while(arr[j]<=arr[i]){
                j--;
            }
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        int left=i+1;
        int right=n-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
    }
}