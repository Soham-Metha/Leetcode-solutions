class Solution {
    public void solve(TreeNode root,List<Integer> list){
         if(root==null){
             return;
         }
         solve(root.left,list);
         list.add(root.val);
         solve(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        solve(root,list);

       return list;
    }
}