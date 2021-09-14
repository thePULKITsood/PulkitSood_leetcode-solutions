class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        double arr [] =new  double [ n + m ];
        
        int i=0;
        int j=0;
        int k=0;
        
        while (i<n && j<m){
            if(nums1[i] < nums2[j])
            arr[k++]    = nums1[i++];
            else 
                arr[k++]=nums2[j++];
        }
        while (i<n)
            arr[k++]=nums1[i++];
        while (j<m)
            arr[k++]=nums2[j++];
        
        //find the median 
        
        if( (n+m) %2 == 1)
            return arr[(n+m)/2];
        
        else return (arr[(n+m)/2] + arr[(n+m)/2 -1 ])/2;
    }
}

//overall run time ==log (m+n);