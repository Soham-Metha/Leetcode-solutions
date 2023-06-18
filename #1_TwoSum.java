/*

Outer For Loop : decides the difference between the index of the numbers to be added
Inner For Loop : adds the value of `j` and `j-i` and checks if the answer is correct
Ex: during the first loop we add the adjecent values        ( 0 & 1 , 1 & 2 , 2 & 3 , ...)
    during the second loop we add the values differing by 2 ( 0 & 2 , 1 & 3 , 2 & 4 , ...)
    during the third loop we add the values differing by 3  ( 0 & 3 , 1 & 4 , 2 & 5 , ...)

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 1; i<nums.length;i ++)
        {
            for(int j = i ; j<nums.length;j ++)
            {
                if( nums[j] + nums[j-i] == target )
                {
                    ans[0]=j-i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}