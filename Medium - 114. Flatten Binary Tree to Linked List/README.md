# 114. Flatten Binary Tree to Linked List

## Problem
Given the root of a binary tree, flatten it into a linked list **in-place**.

- Use the same `TreeNode` structure
- `right` pointer points to the next node
- `left` pointer must always be `null`
- Order must follow **preorder traversal**  
  (root → left → right)

---

## Approach 1: Iterative (O(1) Extra Space)

### Idea
For each node:
1. If it has a left subtree
2. Find the **rightmost node** of that left subtree
3. Attach the current node’s right subtree to it
4. Move the left subtree to the right and set `left = null`

### Pros
- O(1) extra space
- Meets the **follow-up requirement**
- No recursion

### Cons
- Pointer manipulation is harder to understand

---

## Approach 2: DFS Preorder (Recursion)

### Idea
- Traverse the tree in preorder
- Keep a global `prev` pointer
- Link `prev.right → current node`
- Always set `prev.left = null`

### Pros
- Very clear and intuitive
- Easy to implement

### Cons
- Uses recursion stack (O(n) space)

---

## Example

