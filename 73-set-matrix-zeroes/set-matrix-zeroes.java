class Solution {
    public void setZeroes(int[][] mat) {
        int arr[][]= new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                arr[i][j]= mat[i][j];

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    for(int k=0;k<arr[0].length;k++)
                    {
                        arr[i][k]=0;
                    }
                    for(int k=0;k<arr.length;k++)
                    {
                        arr[k][j]=0;
                    }
                   
                }
                
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                mat[i][j]=arr[i][j];
            }
        }return;
        


}
    }
