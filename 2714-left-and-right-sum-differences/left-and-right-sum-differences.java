class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;

        }
        int l[]= new int[nums.length];
        int lsum=0;
        l[0]=0;
        for(int i=1;i<l.length;i++)
        {
            lsum+=nums[i-1];
            l[i]=lsum;

        }
        int rsum=sum;
        int r[]= new int[nums.length];
        for(int i=0;i<r.length;i++)
        {

            rsum-=nums[i];
            r[i]=rsum;

        }

        int ans[]=new int[nums.length];
        for(int i=0;i<ans.length;i++)
        {
            int o=Math.abs(l[i]-r[i]);
            ans[i]=o;
        }return ans;


        
    }
}