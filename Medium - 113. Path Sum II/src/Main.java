import java.util.ArrayList;
import java.util.List;

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
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        check(root,targetSum,new ArrayList<>(),0);
        return result;
    }

    public void check (TreeNode node , int target,List<Integer> list,int sum){
        if(node == null) return;
        sum += node.val;
        list.add(node.val);
        if(node.right == null && node.left == null){
            if(sum == target){
                result.add(new ArrayList<>(list));
            }
        }
        check( node.left,target,new ArrayList<>(list),sum);
        check(node.right,target,new ArrayList<>(list),sum);
    }


//    private List<List<Integer>> result = new ArrayList<>();
//
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        dfs(root, targetSum, new ArrayList<>(), 0);
//        return result;
//    }
//
//    private void dfs(TreeNode node, int target, List<Integer> path, int sum) {
//        if (node == null) return;
//
//        path.add(node.val);
//        sum += node.val;
//
//        if (node.left == null && node.right == null) {
//            if (sum == target) {
//                result.add(new ArrayList<>(path));
//            }
//        } else {
//            dfs(node.left, target, path, sum);
//            dfs(node.right, target, path, sum);
//        }
//
//        path.remove(path.size() - 1);
//    }
}