/*

starting from index 0(variable i),we check if the substring of "haystack" (from i to i+length of needle) is equal to needle
if it is,then we return i

*/

class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        for(int i = 0; i< haystack.length()-needle.length()+1;i++)
        {
            if (needle.equals(haystack.substring(i,i+needle.length())))
            {
                return i;
            }
        }
        return -1;
    }
}