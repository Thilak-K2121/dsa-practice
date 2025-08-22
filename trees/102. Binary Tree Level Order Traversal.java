class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<TreeNode>();       
        List<List<Integer>> list= new ArrayList<>();
        if(root==  null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int num=queue.size();
            List<Integer> sublist= new ArrayList<>(num);
            for(int i=0;i<num;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                sublist.add(node.val);
            }
            list.add(sublist);
        }
        return list;

    }
}
