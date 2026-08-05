# 287. Find the Duplicate Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/find-the-duplicate-number/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Array` · `Two Pointers` · `Binary Search` · `Bit Manipulation` · `Pigeonhole Principle` · `Floyd's Cycle Finding Algorithm` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 4 ms |
| **Memory** | 82.9 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do { slow = nums[slow]; fast = nums[nums[fast]]; } while (slow != fast);
        slow = nums[0];
        while (slow != fast) { slow = nums[slow]; fast = nums[fast]; }
        return slow;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
