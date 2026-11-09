class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2){
            return true;
        }
        int delY21=coordinates[1][1]-coordinates[0][1];
        int delX21=coordinates[1][0]-coordinates[0][0];

        for(int i=2; i<coordinates.length; i++){
           int delYI1=coordinates[i][1]-coordinates[0][1];
           int delXI1=coordinates[i][0]-coordinates[0][0];
           if(delY21*delXI1 != delX21*delYI1){
            return false;
           }
        }
        return true;
    }
}