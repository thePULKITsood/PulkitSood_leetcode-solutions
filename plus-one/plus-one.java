class Solution {
    public int[] plusOne(int[] A) {
        int n = A.length;
        ArrayList<Integer> ans = new ArrayList();
        int carry =1;

        for (int i=n-1;i>=0;i--){
            if(carry==1){
                if(A[i]==9){
                    ans.add(0);
                }
                else{
                    ans.add(A[i]+1);
                    carry=0;
                }
            }
            else 
                // if(A[i]!=0)
             ans.add(A[i]);
        }
        if(carry==1)
        ans.add(1);
        int res[]=new int [ans.size()];
        int j=0;
        for (int i=ans.size()-1;i>=0;i--){
            res[j]=ans.get(i);
            j++;
        }
        return res;

    }

}