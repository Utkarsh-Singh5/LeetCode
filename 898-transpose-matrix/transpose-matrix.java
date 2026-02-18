class Solution {
    public int[][] transpose(int[][] m) {
        int m1[][]= new int[m[0].length][m.length];
        for(int j=0;j<m.length;j++)
        {  
           
            for(int i=0;i<m[0].length;i++)
            {
                
                m1[i][j]=m[j][i];
                
               

            } 
        }return m1;
        
    }
}