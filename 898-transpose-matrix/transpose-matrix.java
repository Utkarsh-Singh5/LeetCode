class Solution {
    public int[][] transpose(int[][] m) {
        int row=m.length;
        int col=m[0].length;
        int m1[][]= new int[m[0].length][m.length];
        for(int j=0;j<row;j++)
        {  
           
            for(int i=0;i<col;i++)
            {
                
                m1[i][j]=m[j][i];
                
               

            } 
        }return m1;
        
    }
}