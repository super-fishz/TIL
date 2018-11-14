# [Preorder Traversal](https://www.hackerrank.com/challenges/tree-preorder-traversal/problem)
# Problem
간단한 preorder 탐색
# Solve
```java
    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
```
오랫만에 자바 하려니 죽을맛...
아쉽게도 다른 언어로는 제공되는게 몇개 없다.
