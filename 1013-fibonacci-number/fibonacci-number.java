class Solution {
    public int fib(int n) {
        
        return fibo(n);
    }

    public int fibo(int n)
    {
        if(n==0)return 0;
        if(n==1)return 1;
        int fn1=fibo(n-1);
        int fn2=fibo(n-2);

       int fn3=fn1+fn2;
        return fn3;

    }
}