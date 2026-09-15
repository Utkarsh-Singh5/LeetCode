class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int start = 1 ,end = 0 ,ans = 0;
        for(int i = 0;i<n;i++){
            end = Math.max(end ,piles[i]);
        }


        while(start<=end){
            int mid =start+(end-start)/2;
            long totaltime = 0;
            for(int i = 0;i<n;i++){
                totaltime+=piles[i]/mid;
                if(piles[i]%mid!=0){
                    totaltime++;
                }
            } 
            if(totaltime<=h){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}