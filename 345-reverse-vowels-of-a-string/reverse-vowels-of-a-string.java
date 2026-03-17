class Solution {
    public String reverseVowels(String s) {
        
        char[] ar={'a','e','i','o','u','A','E','I','O','U'};
        char[] f= new char[s.length()];
        for(int i=0;i<f.length;i++)
        {
            f[i]=s.charAt(i);
        }
        
        int l=0;
        int r=f.length-1;

        while(l<r)
        {
            int c1=0;
            int c2=0;
            char s1=f[l];
            char s3=f[r];
                for(int i=0;i<ar.length;i++)
                {
                    if(s1==ar[i])
                    {
                        c1=1;
                    }
                    if(s3==ar[i])
                    {
                        c2=1;
                    }
                }
                if(c1==0)
                {
                    l++;
                }
                else if(c2==0)
                {
                    r--;
                }
                else
                
                    {
                        char swap=f[l];
                        f[l]=f[r];
                        f[r]=swap;
                        l++;
                        r--;
                    }
                
        }return String.valueOf(f);
    }
}