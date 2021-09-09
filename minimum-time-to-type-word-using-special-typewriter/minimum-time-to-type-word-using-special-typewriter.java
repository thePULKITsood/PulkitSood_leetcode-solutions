class Solution {
    public int minTimeToType(String word) {
        int n=word.length();
        int ans=n;
        char prev ='a';
        for (int i=0;i<n;i++){
            int dis = Math.abs(word.charAt(i)-prev);
            if(dis>13){
                dis-=13;
            ans+=(13-dis);
            }
            else {
                ans+=dis;
            }
            prev=word.charAt(i);
            
        }
        return ans;
        
        
    }
    /*
    a-> n =13
    a-> 0 = 14
        a4-13 = 1
        13-1 = 12
        
        a->r - 17 
        17-13 = 4 
        13-4=9
      */  
}