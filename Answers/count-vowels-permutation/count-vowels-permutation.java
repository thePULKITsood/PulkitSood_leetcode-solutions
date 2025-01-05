class Solution {
    public int countVowelPermutation(int n) {
        // a=0,e=1,i=2o=3u=4
         ArrayList<Integer> [] map = new ArrayList[5];
         for (int i=0;i<5;i++){
             
             ArrayList<Integer> list = new ArrayList();
             if(i==0){
                 list.add(1);
                 list.add(2);
                 list.add(4);
             }
             else if (i==1){
                 list.add(0);
                 list.add(2);
                
             }
             else if (i==2){
                 list.add(1);
                 list.add(3);
               
             }
             else if (i==3){
                 list.add(2);
               
             }
             else if (i==4){
                 list.add(2);
                 list.add(3);
             }
             map[i]=list;
                
         }
        int mod=1000000007;
        int dp [][] = new int [5][2];
        
        for (int j=0;j<5;j++){
            dp[j][0]=1;
        }
        
        while (n-->1){
            
            for (int j=0;j<5;j++){
                  int add =0;
                for(int index : map[j]){
                    add+=dp[index][0];
                    add%=mod;
                }
               dp[j][1]=add;
            }
            
            //change the columns;
            
            for (int j=0;j<5;j++){
                dp[j][0]=dp[j][1];
            }
            
        }
        int sum =0;
        
            for (int j=0;j<5;j++){
                sum+=dp[j][0];
                sum%=mod;
            }
        
        return sum;
        
        
    }
}
/*

        the next character depends on the previous character 
   
    a e i o u
    
    forward 
    
     a -> e
     e -> a , i 
     i -> a , e , o , u
     o -> i , u 
     u -> a


backward
     e,i,u     <-a               
     a , i     <-e
     e,o       <-i
     i         <-o
     o , i     <-u
     
     for (aeiou)
     back (prev , map , len ){
     if(len==n)
     ans++;
    for(i:mapget(prev))
    prev=i
    back(prev,map,l+1)
     }
     
     }
*/