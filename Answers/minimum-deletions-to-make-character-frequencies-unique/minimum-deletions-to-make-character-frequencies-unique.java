class Solution {
    public int minDeletions(String s) {
        int [] arr = new int [26];
        for (char c : s.toCharArray()){
            arr[c-'a']++;
            
        }
        int ans=0;
        Arrays.sort(arr);
        int max =  arr[25];
        
        for (int i =25;i>=0;i--){
            if(arr[i]==0)break;
            
            if(arr[i]>max){
                ans+=arr[i]-max;
            }
            else{
                max=arr[i];
            }
            if(max>0)max--;
        }
        return ans;
        
    }
}
//basically i have a array of numbers and i have to made deletions and make the numbers such that no two are equal 

// basically  
/*
1. make a 26 array - sort it 
traverse if  arr[i]==arr[i-1]


3 4 2 5 
    
1 2 3 4 
3 2 2 1 ->8
    
3 4 2 1
1 0 3 4 -> 8     
    
    dec the number by 1 then keep moving left and find a place for the number such that it is greater than the num[i]
    if we move left such that we have not found it make it dec by 1 
    */