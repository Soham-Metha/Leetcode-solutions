/*

starting from index 1(variable i) , we check if the value is same as the value of element at l
if it is not same ,then me increase the value of l & set the element at index l to the new value

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int l =0;
        for(int i = 1; i < nums.length;i++)
        {
            if (nums[l]!=nums[i])
            {
                l++;
                nums[l]=nums[i];
            }
        }
        return l+1;
    }
}