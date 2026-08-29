class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums1){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
            map.put(num,1);
        }
        }
        
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int [] ans=new int[list.size()];
        int k=0;
        for(int i=0; i<list.size(); i++){
            ans[k]=list.get(i);
            k++;
        }
        return ans;
}
}