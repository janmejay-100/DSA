class Solution {
    public int missingNumber(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(x>0){
            set.add(x);
            }
        }
        int i=1;
        while(set.contains(i)){
            i++;
        }
        return i;
    }
}
