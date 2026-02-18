class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        
        List list= new ArrayList<>();
        for(int i=0;i<m.length;i++)
        {
           
           
            for(int j=0;j<m[0].length;j++)
            {
                int c=0;
                for(int l=0;l<m[0].length;l++)
                {
                    if(m[i][j]<m[i][l])
                    {
                        c++;
                        //a++;

                    }
                }
                
                 int d=0;
                for(int o=0;o<m.length;o++)
                {
                    if(m[i][j]>m[o][j])
                    {
                        d++;
                        
                       
                    }
                }

            if((c==m[0].length-1)&&(d==m.length-1))
            {
              list.add(m[i][j]);
              break;
            }
        }
            
            
        }return list;
        
    }
}