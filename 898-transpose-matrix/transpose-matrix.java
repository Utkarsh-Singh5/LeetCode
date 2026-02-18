class Solution {
    public int[][] transpose(int[][] m) {
        int m1[][]= new int[m[0].length][m.length];
        for(int j=0;j<m1.length;j++)
        {  
           
            for(int i=0;i<m1[0].length;i++)
            {
                
                m1[j][i]=m[i][j];
                
               

            } 
        }return m1;
        
    }
}