class Solution {
    public int diagonalSum(int[][] m) {

        int s=0;
        int r=m[0].length;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                if((i==j)||(i+j)%(r-1)==0)
                {
                    s+=m[i][j];
                }

            }
        }return s;
        
    }
}