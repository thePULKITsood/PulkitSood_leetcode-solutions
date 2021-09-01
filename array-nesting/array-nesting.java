class Solution {
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        int max=0;
        int ans [] = new int [n];
        Set<Integer> set = new HashSet();
        for (int i=0;i<n;i++){
            int num=0;
            int j =i;
            if(ans[j]==0){
                while(!set.contains(j))
                {       
                num++;
                set.add(j);
                j=nums[j];
                }
                
                for(int index : set){
                    ans[index]=num;
                }
                max=Math.max(max,num);
                num=0;
                set=new HashSet();
            }
        }
        return max;
    }
}