class Solution {
    public boolean isPowerOfThree(int n) {

        int x=n;
        if(x==0)return false;
        if(x==1)return true;
        
        int c=0;
        while(x>0)
        {
            if(x%3==0)
            {
                c++;
                if(Math.pow(3,c)==n)
                {
                    return true;
                }
            }
            else
            {
                c=0;
                if(c==0)
                return false;
                
            }
            x=x/3;

        }return false;
        
    }
}