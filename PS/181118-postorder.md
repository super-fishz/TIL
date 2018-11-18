# [Postorder Tree](https://www.hackerrank.com/challenges/tree-postorder-traversal/problem)
## Problem
postorder tree traversal
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
