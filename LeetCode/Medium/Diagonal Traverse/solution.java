class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        List<Integer> list=new ArrayList<>();
        for(int i=0; i<m+n-1; i++){
            List<Integer> diagonal=new ArrayList<>();

            for(int row=0; row<m; row++){
                int col=i-row;
                if(col>=0 && col<n){
                    diagonal.add(mat[row][col]);
                }
            }
            //Reverse even diagonal------------------------------------
            if(i%2==0){
                Collections.reverse(diagonal);
            }
            list.addAll(diagonal);
        }

        //Put it in the array------------------------------------
        
        int res[]=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i]=list.get(i);
        }
        return res;
    }
}