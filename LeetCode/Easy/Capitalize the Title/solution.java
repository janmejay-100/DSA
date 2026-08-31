class Solution {
    public String capitalizeTitle(String title) {
        String []word=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String wo:word){
            if(wo.length()<=2){
                sb.append(wo.toLowerCase());
            }else{
                sb.append(Character.toUpperCase(wo.charAt(0)));
                sb.append(wo.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}