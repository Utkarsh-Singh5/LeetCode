class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        Solution s= new Solution();
        for(int i=0;i<4;i++){

            if(s.isequals(mat,target))
            {
                return true;
            }
            s.transpose(mat);
        }return false;
        
      
    }
    void transpose(int[][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i;j<mat.length;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        
        for(int i=0;i<mat.length;i++)
        {
            int l=0, r=mat.length-1;

            while(l<r)
            {
                int t=mat[i][l];
                mat[i][l]=mat[i][r];
                mat[i][r]=t;
                l++;
                r--;
            }
            
        }
    }
    boolean isequals(int mat[][], int [][] target)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i][j]!=target[i][j])return false;
            }
        }
        return true;
    }
    
}