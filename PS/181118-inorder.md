# [Inorder](https://www.hackerrank.com/challenges/tree-inorder-traversal/problem)
## Problem
Inorder Tree Traversal
## Solve
```java
   public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
```
