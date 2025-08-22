class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<Integer>();
        helper(root,list);
        return list;
    }

    private static void helper(TreeNode root,List<Integer> list){
        if(root==null)  
            return;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}
