class Solution {
    public int findNumberOfLIS(int[] nums) {
        int maxlen =0;
        int ans=0;
        
        int n = nums.length;
        
        int len []=new int [n];
        int cnt []= new int [n];
        
        for (int i=0;i<n;i++){
            len[i]=cnt[i]=1;
            
        for (int j=0;j<i;j++){
            
            if(nums[j]<nums[i]){
                
                int length = len[j]+1;
                
                if(length==len[i])
                    cnt[i]+=cnt[j];
                
                else if (length>len[i])
                {
                    len[i]=length;
                    cnt[i]=cnt[j];
                }
            }
            
        }
            if(maxlen == len[i])
                ans+=cnt[i];
            
            else if (maxlen<len[i])
            {
                maxlen=len[i];
                ans=cnt[i];
            }
        }
        return ans;
    }
}