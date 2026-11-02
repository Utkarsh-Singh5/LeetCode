// class Solution {
//     public int pivotIndex(int[] nums) {
//         int totalsum=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             totalsum+=nums[i];
//         }
//         int left=0;
        
//         int right=totalsum;
//         for(int i=0;i<nums.length;i++)
//         {
//                 if(i==0)
//                 {
                    
//                     right=totalsum-nums[i];
//                     if(left==right)
//                     { 
//                         return i;
//                     }
//                 }
//                 else{
//                     left+=nums[i-1];
//                     right=totalsum - left-nums[i];
//                     if(left==right)
//                     { 
//                         return i;
//                     }
//                 }
            
           
//         }return -1;
//     }
// }

class Solution {
    public int pivotIndex(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        // Store prefix sums
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(i, sum);
        }

        int totalSum = sum;

        for (int i = 0; i < nums.length; i++) {

            int left = 0;
            int right = totalSum - map.get(i);

            if (i > 0) {
                left = map.get(i - 1);
            }

            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}
