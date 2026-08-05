# 5. Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/longest-palindromic-substring/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Two Pointers` · `String` · `Dynamic Programming` · `Manacher` |
| **Language** | Java |
| **Solved** | August 5, 2026 |
| **Test cases** | 144 / 144 passed |
| **Runtime** | 14 ms — beats **89.8%** |
| **Memory** | 43.4 MB — beats **89.6%** |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-08-05 by <b>LeetSync</b>.</sub>
