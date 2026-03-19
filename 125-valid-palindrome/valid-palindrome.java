class Solution {
    public boolean isPalindrome(String s) {
        
        //if(s==" ")return true;
        String c= s.toLowerCase();
         
        int h=1;
        c=c.replaceAll("[^a-z0-9]", "");
       int n= c.length();

       for(int i=0;i<c.length()/2;i++)
       {
        if(c.charAt(i)==c.charAt(n-i-1))
        {
            h=1;
        }
        else
        {
            h=0;
            break;
        }
       }return h==1;
        
        
    }
}