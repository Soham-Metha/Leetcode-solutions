class Solution {
    public int singleNumber(int[] nums) {
        int num = 0,flag;
        int i,j;
        for(i =0;i<nums.length;i++)
        {
            num = nums[i];
            flag = 0;
            for(j = 0;j<nums.length;j++)
            {
                if (nums[j]==num && j!=i)
                {
                    flag = 1;
                    break;
                }
            }
            if( flag == 0)
            {
                return num;
            }
        }
        return nums[i-1];
    }
}