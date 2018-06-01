# tree inorder traversal
[https://www.hackerrank.com/challenges/tree-inorder-traversal/problem](https://www.hackerrank.com/challenges/tree-inorder-traversal/problem)


### javascript
```javascript
/*
    Node is defined as
    var Node = function(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
*/

// This is a "method-only" submission.
// You only need to complete this method.

function inOrder(root) {
    if (root.left) inOrder(root.left)
    process.stdout.write(root.data.toString() + " ")
    if (root.right) inOrder(root.right)
    
}
```

### java
