class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4)
        {
            String str = String.valueOf(n);
            int[] arr = new int[str.length()];

            for(int i = 0; i < str.length(); i++)
            {
                arr[i] = str.charAt(i) - '0';
            }
            int s=0;
            for(int i=0;i<arr.length;i++)
            {
                s+=arr[i]*arr[i];

            }
            n=s;
        }return n==1;
        
    }
}