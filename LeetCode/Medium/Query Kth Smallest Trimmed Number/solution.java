class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int [] ans=new int [queries.length];
        int n=nums.length;
        int m=nums[0].length();

        for(int i=0; i<queries.length; i++){
            int k=queries[i][0];
            int trim=queries[i][1];

            //Add original index
            List<Integer> list=new ArrayList<>();
            for(int j=0; j<n; j++){
                list.add(j);
            }
            Collections.sort(list,(a,b)->{
                String s1=nums[a].substring(m-trim);
                String s2=nums[b].substring(m-trim);
                int res=s1.compareTo(s2);
                if(res==0){
                    return a-b;
                }
                return res;
            });
            ans[i]=list.get(k-1);
        }
        return ans;
    }
}