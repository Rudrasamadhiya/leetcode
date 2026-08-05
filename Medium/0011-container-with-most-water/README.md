# 11. Container With Most Water

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/container-with-most-water/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Array` · `Two Pointers` · `Greedy` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 5 ms |
| **Memory** | 77.5 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, water);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
