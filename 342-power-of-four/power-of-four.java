class Solution {
    public boolean isPowerOfFour(int n) {

       return ispow(n);
       
    }
    public boolean ispow(int n)
    {
        if(n==1)return true;
        if(n<=0)return false;

        if(n%4!=0)return false;

        return ispow(n/4);

        


    }
}