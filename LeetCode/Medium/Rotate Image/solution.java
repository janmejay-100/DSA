class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        //Transpose the matrix------
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int k=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=k;
                
            }
        }
        for(int i=0; i<n; i++){
            reverse(matrix[i]);
        }
    }

    //Row reverse------
    public static void reverse(int []arr){
        int st=0;
        int end=arr.length-1;
    while(st<=end){
        int m=arr[st];
        arr[st]=arr[end];
        arr[end]=m;
        st++;
        end--;
    }

    }
}