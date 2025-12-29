//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left,root.right);

    }
    public boolean mirror(TreeNode left , TreeNode right){
        if(left == null && right ==null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return mirror(left.left,right.right) && mirror(left.right,right.left);
    }
}