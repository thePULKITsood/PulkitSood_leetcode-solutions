class Solution {
    public int minSetSize(int[] arr) {
        
        Map <Integer,Integer> map = new HashMap();
        
        int num = arr.length;
        for (int x : arr){
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);
            else 
                map.put(x,1);
        }
        
        int totalNumbers = map.size();
        ArrayList<Integer> list = new ArrayList();
        for (int x : map.values()){
            list.add(x);
        }
        Collections.sort(list,Collections.reverseOrder());
        
        int ans = totalNumbers;
        
        int l = 0;
        int r = totalNumbers;
        int i = (l+r)/2;
        
    while (i>l && i<r){
            int sum=0;
        for (int j=0;j<i;j++){
            sum+=list.get(j);
        }
            
            if(sum>=num/2){
            {
                if(ans>i) ans =i;
            }
            r=i;
                
                
            }
        else{
            l=i;
            
        }
                        i=(l+r)/2;

        }
        return ans;
    }
}
//1 . i create a hashmap 
// 2. now removing -> i can use binary search for the number of elements to choose. =1 to total number of elements and 
// for each amount of numbers i can choose what is the least size that is equivalent to the half or more 

