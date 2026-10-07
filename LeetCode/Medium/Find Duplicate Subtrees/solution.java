/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    Map<String,Integer>map=new HashMap<>();
    List<TreeNode> list=new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        solve(root);
        return list;
    }

    public String solve(TreeNode root){
        if(root==null){
            return "*";
        }
        String left=solve(root.left);
        String right=solve(root.right);

        String key=root.val + "," + left + "," + right;
        
        map.put(key,map.getOrDefault(key,0)+1);

        if(map.get(key)==2){
            list.add(root);
        }
        return key;
    }


}