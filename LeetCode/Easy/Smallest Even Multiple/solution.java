class Solution {
    public int smallestEvenMultiple(int n) {
        int i=n;
        while(i>=n){
            if(i%n==0){
                if(i%2==0){
                    break;
                }
            }
            i++;
        }
        return i;
    }
}