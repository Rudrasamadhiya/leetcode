# 543. Diameter of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/diameter-of-binary-tree/)**

| | |
|:--|:--|
| **Difficulty** | Easy |
| **Topics** | `Tree` · `Depth-First Search` · `Binary Tree` · `DP on Trees` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 0 ms |
| **Memory** | 46.9 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    int depth(TreeNode node) {
        if (node == null) return 0;
        int l = depth(node.left), r = depth(node.right);
        max = Math.max(max, l + r);
        return 1 + Math.max(l, r);
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
