class Solution {
    public String countAndSay(int n) {
        StringBuilder ans =new StringBuilder();
        ans.append(1);
        if (n==1)return ans.toString();
        
        for (int i=2;i<=n;i++){
            ans= func(ans);
            
        }
        return ans.toString();
        
    }
    StringBuilder func(StringBuilder sb){
        int i = 0 ,j=0,count=0;
        StringBuilder newsb= new StringBuilder();
        while (i<sb.length()){
            
            j=i;
            while (j<sb.length() && sb.charAt(i)==sb.charAt(j))
            {
                j++;
            }
            newsb.append((j-i)+"");
            newsb.append(sb.charAt(i));
            i=j;
            
            
        }
        return newsb;
    }
}
// 1
// 1 1 
// 2 1
// 1 2 1 1
// 1 1 1 2 2 1
// 3 1 2 2 1 1 
// 1 3 1 1 2 2 2 1 
    