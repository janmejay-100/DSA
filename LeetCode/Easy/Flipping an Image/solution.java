class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            //Row reverse----
            int left=0;
            int right=image[0].length-1;
            while(left<right){
                int temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
                left++;
            right--;
            }
            // Coulmn 1 to 0------------
            for(int j=0; j<image[i].length; j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }else if(image[i][j]==0){
                    image[i][j]=1;
                }
            }
            
        }
        return image;
    }
}