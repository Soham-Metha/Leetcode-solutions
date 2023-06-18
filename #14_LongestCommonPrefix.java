/*

initialize the string(to be returned)  = 1st string of the array passed
Outer For Loop   : repeat the process for all the elements present
Inner While Loop : remove the last character from our string repeatedly until it matches the prefix of the current element

*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 0; i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}