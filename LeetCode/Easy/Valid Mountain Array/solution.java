class Solution {
    public boolean validMountainArray(int[] arr) {
        // int i=0;
        // int n=arr.length;

        // while(i+1<n && arr[i]<arr[i+1]){
        //     i++;
        // }

        // if(i==0 || i==n-1){
        //     return false;
        // }

        // while(i+1<n && arr[i]>arr[i+1]){
        //     i++;
        // }
        // return i==n-1;

        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i+1<n &&arr[i]<arr[i+1]){
            i++;
        }
        while(j>0 &&arr[j]<arr[j-1]){
            j--;
        }
        return i==j && i!=0 && i!=n-1;
    }
}