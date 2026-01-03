import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> result = binaryTreePaths(root);
        for(String string : result){
            System.out.println(string);
        }
    }
    public static class TreeNode {
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
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root.right == null && root.left ==null){
            list.add(String.valueOf(root.val));
            return list;
        }
        dfs(list,root,"");
        return list;
    }
    public static void  dfs (List<String> result,TreeNode treeNode,String string){
        if(treeNode == null) return ;

        if(string.length() == 0 ){
            string += treeNode.val;
        }else{
            string += "->" + treeNode.val;
        }
        if(treeNode.left == null && treeNode.right == null){
            result.add(string);
            return ;
        }
        dfs(result,treeNode.left,string);
        dfs(result,treeNode.right,string);
    }

//    public static List<String> binaryTreePaths(TreeNode root) {
//        if(root.right == null && root.left ==null){
//            List<String> list = new ArrayList<>();
//            list.add(String.valueOf(root.val));
//            return list;
//        }
//        return dfs(new ArrayList<>(),root,"");
//    }
//    public static List<String> dfs (List<String> result,TreeNode treeNode,String string){
//        if(treeNode == null){
//            result.add(string);
//            return null;
//        }
//        if(string.length() == 0 ){
//            string += treeNode.val;
//        }else{
//            string += "->";
//            string += treeNode.val;
//        }
//        if(treeNode.left == null && treeNode.right == null){
//            result.add(string);
//            return null;
//        }
//        if(treeNode.left != null){
//            dfs(result,treeNode.left,string);
//        }
//        if(treeNode.right != null){
//            dfs(result,treeNode.right,string);
//        }
//        return result;
//    }
}