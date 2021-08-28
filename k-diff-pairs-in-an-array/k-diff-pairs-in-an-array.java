class Solution {
    public int findPairs(int[] nums, int k) {
        
        Set <Integer> set = new HashSet();
        int zero=0;
        Map<Integer,Integer> map  = new HashMap();
        Set <String> ans = new HashSet();
        for (int n:nums){
            set.add(n);
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for (int n : map.values()){
            if(n>=2)
                zero++;
        }
        if(k==0)
            return zero;
        int n = nums.length;
        for (int i = 0 ;i < n ; i++){
            int find = nums[i]-k;
            if(set.contains(find)){
                //add to a new set
                //small big
                int  arr [] = new int [2];
                arr[0]=nums[i];
                arr[1]=find;
                Arrays.sort(arr);
                String s = " "+arr[0]+"  "+arr[1];
                ans.add(s);
            }
            find = nums[i]+k;
              if(set.contains(find)){
                //add to a new set
                //small big
               int  arr [] = new int [2];
                arr[0]=nums[i];
                arr[1]=find;
                Arrays.sort(arr);
                  String s = " "+arr[0]+"  "+arr[1];
                ans.add(s);
            }
            
        }
        List<String> list = new ArrayList(ans);
        // System.out.println(ans);
        for (int i = 0 ;i<list.size();i++){
         System.out.println(list.get(i));}
        return ans.size();
        
        
    }
}
/*
[3,1,4,1,5], k = 2
    1 3 
    3 5
    
    3-> 3-x=2  x=3-2 = 1 
        3-x = -2  x=5
  
  in the hashmap i will store the numebers as it is then while searching i will search two numbwers 
  
  a-b = k 
  a - b = -k
  
  a-k = b
  and
  a+k = b
  as i have to return unique pairs just remove then one which was found means b not a 
  
*/
// 1-0 = 1 
// 1-2 = -1 

//      2 3 4 5 
    
//     1-2 