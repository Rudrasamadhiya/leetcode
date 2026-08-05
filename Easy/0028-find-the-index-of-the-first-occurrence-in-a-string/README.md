# 28. Find the Index of the First Occurrence in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)**

| | |
|:--|:--|
| **Difficulty** | Easy |
| **Topics** | `Two Pointers` · `String` · `String Matching` · `Z Algorithm` · `Knuth–Morris–Pratt Algorithm` · `Boyer–Moore String-Search Algorithm` |
| **Language** | Java |
| **Solved** | February 2, 2026 |
| **Runtime** | 0 ms |
| **Memory** | 42.3 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int strStr(String haystack, String needle) {
       
        int l2=needle.length();
        int l1=haystack.length();
         if (needle.length() == 0 || l2>l1) 
        return -1;
        for (int i=0;i<l1-l2+1;i++)
        {
           if(haystack.charAt(i)==needle.charAt(0))
            {
                if (haystack.substring(i,i+l2).equals(needle))
                return i;
            }
        }
        return -1;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-02-02 by <b>LeetSync</b>.</sub>
