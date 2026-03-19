class Solution {
    public boolean isPalindrome(String s) {
        
        //if(s==" ")return true;
        String c= s.toLowerCase();
        c=c.replaceAll("[^a-z0-9]", "");
       int n= c.length();

       for(int i=0;i<c.length()/2;i++)
       {
        if(c.charAt(i)!=c.charAt(n-i-1))
        {
            return false;
        }
       }return true;
        
        
    }
}