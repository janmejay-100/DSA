class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int []res=new int [n];

        for(int i=0; i<n; i++){
            int max=-1;
            for(int j=i+1; j<n; j++){
                if(max<arr[j]){
                    max=arr[j];
                }
                res[i]=max;
            }
        }
        res[n-1]=-1;
        return res;
    }
}