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
