# 704. Binary Search

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/binary-search/)**

| | |
|:--|:--|
| **Difficulty** | Easy |
| **Topics** | `Array` · `Binary Search` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 0 ms |
| **Memory** | 48.3 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
