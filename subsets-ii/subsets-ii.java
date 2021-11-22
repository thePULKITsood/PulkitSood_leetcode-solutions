class Solution {
    List<List<Integer>> fullans = new ArrayList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       HashMap < Integer,Integer  > fmap = new HashMap <> ();
       ArrayList<Integer> unique = new ArrayList<>();
       
        for (int num : nums )
        {
            if (fmap.containsKey(num))
                fmap.put(num,fmap.get(num) + 1 );
                            
            else {
            fmap.put(num,1);
            unique.add(num);}
        }
        
//         level = nums 
//         choices - ya to na aao 
//         ya to aana hoai to 0 - 1 - 2 - jitni freq hai utni bar tak aa sakte ho 
        
//         and the rec stops when sab nums ho jae 
        solve (unique,fmap ,0 ,  new ArrayList<Integer> () );
return fullans;        
    }
    
    void solve (ArrayList<Integer>unique , HashMap < Integer,Integer  > fmap,int start  , ArrayList <Integer>ans)
    
    {
        if (start  == unique.size()){
//             means we have give  all the nums choices and they have chosen teh required choice now we can print 
           fullans.add(new ArrayList<>(ans));
            return ;
        }
        
        int num = unique.get(start);
//         now on the level we have our num 
//         and teh  choices it has are equal to its freq+1 
//         1. it eill not come 
        solve(unique,fmap,start+1,ans);
//         2 . it will come 1-freq times 
        
        // 1 warri full 
        // 2 warri full 
            
//         matlab ikathe aane chahide saare numbers 
        int freq = fmap.get(num);
        //kinni war aane full
        for (int i = 1 ;i<=freq ; i++)
        {
            //add karro i war 
            for (int j = 0;j<i;j++)
            ans.add(num);
            
            solve(unique,fmap,start+1 ,ans);
            
            
            //remove karo i war
             for (int j = 0;j<i;j++)
            ans.remove(ans.size()-1);
            
        }
    }


{
//         if (start == nums.length){
//             fullans.add(new ArrayList<>(ans));
//             return ;
//         }
        
//         for (int i : fmap.keySet())
//         {
//             if (fmap.get(i)>0){
// //                 then  it has two choices whetehr tocome or not 
//                 solve (nums,fmap ,start + 1,ans ); //not comming --  ans as it is  
                
// //                 if it comes we will reduce the frequency 
//                 fmap.put(i,fmap.get(i)-1 );
//                 ans.add(i);
//                 solve (nums,fmap,start+1 ,ans);
                
//                 ans.remove(ans.size()-1);
//                 fmap.put(i,fmap.get(i)+1 );
                
//             }
//         }
    }
}