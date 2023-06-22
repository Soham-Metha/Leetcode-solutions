class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = m; i<nums1.length ; i++)
        {
            int j = i-1;
            int k = nums2[i-m];
            while (j>=0 && nums1[j]>k)
            {
                nums1[j+1]=nums1[j];
                j--;
            }
            nums1[j+1] = k;
        }
        return;
    }
}