class Solution {

    int parent[];
    public int largestComponentSize(int[] nums) {
        int n = nums.length;
        
        parent  = new int [100001];
        Arrays.fill(parent,-1);
        
        for (int i=0;i<n;i++){
            
            int a = nums[i];
        
            for (int p=2; p*p <= a ; p++ ){
                
                if(a%p==0){
                
                    union(a,p);
                    union(a,a/p);
                }
            }
        }
        int max=0;
        HashMap<Integer,Integer> map = new HashMap();
        for (int i=0;i<n;i++){
            
            int p = find(nums[i]);
            map.put(p,1+map.getOrDefault(p,0));
            
            max=Math.max(max,map.get(p));
        }
        return max;
        
        
    }
    int find (int u){
        if(parent[u]==-1)return u;
        
        parent[u]=find(parent[u]);
        
        return parent[u];
    }
    void union (int a , int b ){
        int para= find(a);
        int parb= find(b);
        if(para!=parb){
            parent[para]=parb;
        }
    }
}

/*

1. union find 

2. each grp has a set of common factors if the number and the grp has some same common factors then we add them to the grp meaning make the parents same and increase the size and add the new factors to the set of common factors 


steps pf the algo 
1. for each number get the prime factors in a arraylist 

2. now  parent array and find function 

union -> for two numbers  if atleast thier prime factor is similar (have_common_primefactor) -> basically the addition to be made in the find funciton 

then do the union  and increase the size union based on size 

and keep storing all the prime factors in the set of prime factors of the parent so that we compare only that 



*/