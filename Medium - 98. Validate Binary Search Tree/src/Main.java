//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean dfs(TreeNode node, long min, long max) {
            if (node == null) return true;

            if (node.val <= min || node.val >= max) return false;

            return dfs(node.left, min, node.val)
                    && dfs(node.right, node.val, max);
        }
    }


//    boolean check = true;
//    public boolean isValidBST(TreeNode root) {
//        if(root.left == null && root.right == null){
//            return true;
//        }
//        if(root.left !=null){
//            if(root.left.val >= root.val) return false;
//        }
//        if(root.right !=null){
//            if(root.right.val <= root.val) return false;
//        }
//        if(isValidBST(root.left) && isValidBST(root.right)){
//            return true;
//        }else{
//            return false;
//        }
//    }
}