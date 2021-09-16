class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList();
        ans.add(nums[0]);
        for (int i=1;i<n;i++){
            if(nums[i]>ans.get(ans.size()-1)){
                ans.add(nums[i]);
            }
            else {
                //do a binary search and find the element just bigger than or equal to this one
                int j = search(ans,nums[i]);
                ans.set(j,nums[i]);
            }
        }
        return ans.size();
    }
    int search(ArrayList<Integer> ans , int x){
        int left=0;
         int right= ans.size()-1;
        while (left<right){
            int mid = (left+right)/2;
            if(ans.get(mid)==x)return mid;
            else if (ans.get(mid)<x) left = mid+1;
            else right =mid;
        }
        return left;
    }
}