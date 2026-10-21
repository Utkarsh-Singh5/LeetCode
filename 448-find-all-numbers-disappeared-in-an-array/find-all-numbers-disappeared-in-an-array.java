class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        

        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i]);
            if(nums[index-1]>0)
            {
                nums[index-1] *=-1;
            }
        }
        List<Integer> des= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                des.add(i+1);
            }
        }return des;
    }
}