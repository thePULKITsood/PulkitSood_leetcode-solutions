class Solution {
        
    
 List<Integer> ans = new ArrayList<>();
    int size ;

    public List<Integer> lexicalOrder(int n) {
        size = n;
        for (int i =1 ; i<=9 ; i++)
        {
            dfs (i );
        }
        return ans;
    }
    public void dfs (int i )
    {
        
        
        // base case 
        if (i>size )
            return ;
//     first add  th e number it self 
        ans.add(i);
        
//          main thing is how we identify children = i*10 + j 
//          now call all the childrens of the number 
//         childrens will be called by i *10 + j 
        
        for (int j =0 ; j<=9 ; j++)
        {
            
            // to further optimise i can do 
            if (i*10 + j <=size )
            dfs(i*10 +j );
        }
    }
}