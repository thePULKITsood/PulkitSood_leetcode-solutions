class Solution {
    int memo[][];
    public int maxCoins(int[] nums) {
        int n = nums.length;
        memo=new int [n+2][n+2];
        return func(-1,n,nums);
        
    }
    int func (int start , int end , int []nums){
        if(end==start+1)return 0;
        // as there are no baloons to burst and we are only bursting baloons from start +1 to end -1 
        int ans = 0;
        
        if(memo[start+1][end+1]!=0)return memo[start+1][end+1];
        int left;
        
        if(start==-1) left=1;
        else  left = nums[start];
        
        int right ;
        
        if(end == nums.length )    right =1;
        else right = nums[end];
        
        
        for (int b = start+1;b<end;b++){
            // b will not be included in left and right and it will be poped last 
                   
            int sum = func(start,b,nums) + func(b,end,nums) + left*nums[b]*right;
            ans=Math.max(ans,sum);
        }
        return memo[start+1][end+1]=ans;
    }
}

/*



burst the middle baloon at last that means -> we will be  sure of the boundaries of left and right then ! 
abb mere ko dekhna hai which baloon must be the last ballon to burst so that i get the minimum answer 

1. add 2 pseudo elements one at the beginning and one at the end  -> thus we can say that  elements will be like  1---------1 
2 . we need to burst baloons from i+1 to j-1 inclusive for all the sub problems 
3. end me jab last baloon burst karne wala hoga then i will be left with only the middle element and two ones on its side 


*/