class Solution {
    int ans = 0;
    
    public int countArrangement(int n) {
    back(1,new boolean [n+1] , n);
        return ans;
        
    }
   void back(int idx , boolean visited[] , int n ){
        //put all the suitable elements at that index and start a call from thm 
        
        if(idx > n)
            ans++;
        
        for (int i = 1 ; i<= n ; i++){
            if(visited[i]==false && (idx%i==0 || i%idx == 0)){
                //means we can fit it here fit it here and call the next ones 
                visited[i]=true;
                
                back(idx+1,visited,n);
                
                visited[i]=false;
            }
        }
        
    }
}