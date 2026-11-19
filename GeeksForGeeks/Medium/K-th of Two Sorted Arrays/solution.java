class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n=b.length;
        int m=a.length;
        int [] res=new int[m+n];
        int p=0;
        for(int i=0; i<m; i++){
            res[p++]=a[i];
        }
        for(int i=0; i<n; i++){
            res[p++]=b[i];
        }
        Arrays.sort(res);
        return res[k-1];
    }
}