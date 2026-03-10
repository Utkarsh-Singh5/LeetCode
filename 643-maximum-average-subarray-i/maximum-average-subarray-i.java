class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double wl=0;
        double mav=0;

        for(int i=0;i<k;i++)
        {
            wl+=(double)nums[i];
        }
        mav=(double)(wl);

        for(int i=k;i<nums.length;i++)
        {
            wl+=(double)(nums[i]-nums[i-k]);
            mav=(double)Math.max(wl,mav);
        }return (double)(mav)/k;
        
    }
}