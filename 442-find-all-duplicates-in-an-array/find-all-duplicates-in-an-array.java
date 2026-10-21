class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Arrays.sort(nums);
        // List<Integer> list= new ArrayList<>();
        // int c=0;
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(nums[i]==nums[i-1])
        //     {
        //         c++;
        //         if(c>=1)
        //         {
        //             list.add(nums[i]);
        //         }
        //     }
        // }return list;

        List<Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=Math.abs(nums[i]);
            if(nums[n-1]<0)
            {
                list.add(n);
            }
            else
            {
                nums[n-1]=-nums[n-1];
            }
        }return list;
    }
}