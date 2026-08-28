class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }

        // int ans[]=new int[nums1.length];
        // int i=0;
         List<Integer> list=new ArrayList<>();
        for(int num:set1){
            if(set2.contains(num)){
                list.add(num);
                // i++;
            }
        }
            int []ans=new int[list.size()];
            int k=0;
            for(int i=0; i<list.size(); i++){
                ans[k]=list.get(i);
                k++;
            }
        return ans;
       //This is a method of Slicing method

    }
}