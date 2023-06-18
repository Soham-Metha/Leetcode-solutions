/*

create a copy of the orignal number and use it to get the reversed value
compare the original num and reversed num

*/

class Solution {
    public boolean isPalindrome(int x) {
        int orignal = x,rev = 0;
        while(orignal > 0)
        {
            rev = rev*10 + orignal%10;
            orignal /= 10;
        }
        if (rev == x)
            return true;
        else
            return false;
    }
}