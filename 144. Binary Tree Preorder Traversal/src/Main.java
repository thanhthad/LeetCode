import java.util.*;

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

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return list;
    }

//    public List<Integer> preorderTraversal(TreeNode root) {
//        Deque<TreeNode> treeNodeStack = new ArrayDeque<>();
//        List<Integer> integerList = new ArrayList<>();
//        while(root != null || !treeNodeStack.isEmpty()){
//            while(root!= null){
//                integerList.add(root.val);
//                treeNodeStack.add(root);
//                root = root.left;
//            }
//            root = treeNodeStack.pop();
//            root = root.right;
//        }
//        return integerList;
//    }
}