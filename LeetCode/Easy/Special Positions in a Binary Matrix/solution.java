class Solution {
    public int numSpecial(int[][] mat) {
        int cnt=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                    int rowcnt=0;
                int colcnt=0;
                //Row Cheak------------
                for(int k=0; k<n; k++){
                    if(mat[i][k]==1){
                        rowcnt++;
                    }
                }

                //Column cheak--------
                for(int k=0; k<m; k++){
                    if(mat[k][j]==1){
                        colcnt++;
                    }
                }
                if(rowcnt==1 && colcnt==1){
                    cnt++;
                }

                }
            }
        }
        return cnt;
    }
}