class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length-1;
        int i = 0;
        int mid;
        while(l>=i)
        {
            mid = (i+l)/2;
            if(nums[mid]<target)
                i = mid+1;
            else if (nums[(i+l)/2]>target)
                l = mid-1;
            else 
                return mid;
        }
        return i;
    }
}