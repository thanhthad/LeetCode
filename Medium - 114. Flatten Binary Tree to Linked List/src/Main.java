public class Main {

    public static void main(String[] args) {
        /*
         * Build example tree:
         *        1
         *       / \
         *      2   5
         *     / \   \
         *    3   4   6
         */
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(4)
                ),
                new TreeNode(
                        5,
                        null,
                        new TreeNode(6)
                )
        );

        Main solution = new Main();

        // Flatten the binary tree
        solution.flatten(root);

        // Print the flattened tree
        // Expected output: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        TreeNode curr = root;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.right != null) System.out.print(" -> ");
            curr = curr.right;
        }
    }

    /**
     * Definition for a binary tree node.
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // ============================================================
    // Approach 1: Iterative (Morris-like traversal)
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // ============================================================

    /**
     * Flattens the binary tree into a linked list using
     * an iterative approach with constant extra space.
     */
    public void flatten(TreeNode root) {
        TreeNode current = root;

        // Traverse the tree starting from the root
        while (current != null) {

            // If the current node has a left child
            if (current.left != null) {

                // Find the rightmost node of the left subtree
                TreeNode rightMost = current.left;
                while (rightMost.right != null) {
                    rightMost = rightMost.right;
                }

                // Connect the original right subtree
                // to the rightmost node of the left subtree
                rightMost.right = current.right;

                // Move the left subtree to the right
                current.right = current.left;

                // Set left child to null as required
                current.left = null;
            }

            // Move to the next node in the linked list
            current = current.right;
        }
    }

    // ============================================================
    // Approach 2: DFS Preorder (Recursive)
    // Time Complexity: O(n)
    // Space Complexity: O(n) due to recursion stack
    // ============================================================

    /*
    private TreeNode prev = null;

    /**
     * Flattens the binary tree using preorder DFS traversal.
     * This method is easier to understand but uses extra space.
     */
    /*
    public void flatten(TreeNode root) {
        if (root == null) return;

        // Link the previous node with the current node
        if (prev != null) {
            prev.right = root;
            prev.left = null;
        }

        // Update previous node
        prev = root;

        // Store left and right children
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Preorder traversal: root -> left -> right
        flattenDFS(left);
        flattenDFS(right);
    }
    */
}
