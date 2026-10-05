class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int [][]arr=new int[map.size()][2];
        int j=0;
        for(int n:map.keySet()){
            arr[j][0]=n;
            arr[j][1]=map.get(n);
            j++;
        }
        Arrays.sort(arr,(a,b)->b[1]-a[1]);
        int []ans=new int[k];
        for(int i=0; i<k; i++){
            ans[i]=arr[i][0];
        }
        return ans;
    }
}