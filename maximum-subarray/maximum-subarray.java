public class Solution {
public int maxSubArray(int[] A) 
{
    int max = -(int)1e6, sum = 0;
    
    
    for (int i = 0; i < A.length; i++)
    {
        if (sum < 0) 
            sum = A[i];
        
        else 
            
            sum += A[i];
        
        
        if (sum > max)
            max = sum;
    }
    return max;
}
}