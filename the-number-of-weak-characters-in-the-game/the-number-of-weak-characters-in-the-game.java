class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        Arrays.sort(arr,(a,b)-> {
            if(a[0]==b[0])
                return a[1]-b[1];
            else 
                return b[0]-a[0];
        });
        
      
        int ans=0;
      int max1=arr[0][0];
       int max2= arr[0][1];
        for (int per [] : arr){
            if(per[0]< max1){
                if(per[1]<max2)
                    ans++;
            }
            max2=Math.max(max2,per[1]);
        }
        return ans;
    }
}

/*
[[7,7],[1,2],[9,7],[7,3],[3,10],[9,8],[8,10],[4,3],[1,5],[1,5]]
10 6  9 5   8 4   8 5   8 7 


[[1,1],[2,1],[2,2],[1,2]]
2 2   2 1  1 2  1 1 

[[7,9],[10,7],[6,9],[10,4],[7,5],[7,10]]


 1  10  5 10   8  10    
 1  9   4 9   6  9 
              10 8      
              9  6  

1. sort on basis of atack

2. then large attack -------  now 
attack is same for all the next groups i need to get a max defence value and check how many have defence alue less than this attack value


// meaniing 1. 
sort on basis of attack   
if attack same sort on baiss of defence 

for the same attack do nothing and 
have a max attack and keep updating the max defence and if any one falls below max attack and max defence add the numner 


*/