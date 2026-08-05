# 647. Palindromic Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/palindromic-substrings/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Two Pointers` · `String` · `Dynamic Programming` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 5 ms |
| **Memory** | 42.9 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    int count = 0;

    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        return count;
    }

    void expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++; l--; r++;
        }
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
