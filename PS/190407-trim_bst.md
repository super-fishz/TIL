# [Trim BST](https://leetcode.com/problems/trim-a-binary-search-tree/)
## Problem
## Solve
```kotlin
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun trimBST(root: TreeNode?, L: Int, R: Int): TreeNode? {
        if (root == null) {
            return root
        }

        
        if (root.`val` > R) {
            return trimBST(root.left, L, R)
        }
            
        if (root.`val` < L) {
            return trimBST(root.right, L, R)
        }
            
        root.left = trimBST(root.left, L, R)
        root.right = trimBST(root.right, L, R)
        
        return root
    }
}
```
오늘 스터디에서 잘 풀었는데 함정에 걸렸다...
