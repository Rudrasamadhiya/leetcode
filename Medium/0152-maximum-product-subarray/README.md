# 152. Maximum Product Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/maximum-product-subarray/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Array` · `Dynamic Programming` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 2 ms |
| **Memory** | 47.4 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int maxProduct(int[] nums) {
        int maxP = nums[0], minP = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(maxP * nums[i], minP * nums[i]));
            int tempMin = Math.min(nums[i], Math.min(maxP * nums[i], minP * nums[i]));
            maxP = tempMax;
            minP = tempMin;
            res = Math.max(res, maxP);
        }
        return res;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
