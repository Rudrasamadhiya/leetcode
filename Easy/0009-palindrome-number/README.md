# 9. Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Solved in](https://img.shields.io/badge/Solved%20in-1m%2008s-a371f7?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/palindrome-number/)**

| | |
|:--|:--|
| **Difficulty** | Easy |
| **Topics** | `Math` |
| **Language** | Java |
| **Solved** | August 5, 2026 |
| **Time to solve** | 1m 08s |
| **Test cases** | 11512 / 11512 passed |
| **Runtime** | 5 ms — beats **81.0%** |
| **Memory** | 46.1 MB — beats **33.8%** |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-08-05 by <b>LeetSync</b>.</sub>
