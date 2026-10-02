class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        
        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        int idx=Integer.MAX_VALUE;
        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                if(i+map.get(list2[i])<idx){
                    idx=i+map.get(list2[i]);
                    res=new ArrayList<>();
                    res.add(list2[i]);
                }else if(i+map.get(list2[i])==idx){
                    res.add(list2[i]);
                }
            }
        }
        String []str=new String[res.size()];
        for(int i=0; i<res.size(); i++){
            str[i]=res.get(i);
        }
        return str;
    }
}