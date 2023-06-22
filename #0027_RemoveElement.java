/*

approach : rather than removing the element, we move all the elements that are not supposed to be removed to the beginning of the array and return only that part of the array.

variable l = length of array to be returned
loop : check if value at index `i` is not equal to the val
       if it is not equal, then set value at index `l`

*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]!=val)
            {
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
    }
}