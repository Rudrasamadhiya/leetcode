# 105. Construct Binary Tree from Preorder and Inorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Array` · `Hash Table` · `Divide and Conquer` · `Tree` · `Binary Tree` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 2 ms |
| **Memory** | 45.6 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    int idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        return build(preorder, map, 0, inorder.length - 1);
    }

    TreeNode build(int[] pre, HashMap<Integer, Integer> map, int l, int r) {
        if (l > r) return null;
        TreeNode root = new TreeNode(pre[idx++]);
        int mid = map.get(root.val);
        root.left = build(pre, map, l, mid - 1);
        root.right = build(pre, map, mid + 1, r);
        return root;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
