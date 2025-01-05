class Solution {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            
            //if low to mid sorted 
            //the check if will i get my ans in between the low and mid 
            
            //if yes continue if not hten make low = mid+1;
            
            if(arr[low] <= arr[mid])//low to mid sorted 
            {
                if(target>=arr[low]&& target<arr[mid])
                    high = mid-1;
                
                else //as the part is soted an the target is not here seo move the left 
                    low = mid+1;
            }
            else // low ot mid is not sorted means mid to right is soted
            {
                if(target>arr[mid] && target<=arr[high])
                    low = mid+1;
                
                else 
                    high = mid-1;
            }
            
            
            //else mid to high sorted 
                
        }
        return -1;
    }
}

//basically jdo apa mid == target check kri da oodo we do as high = mid -1 and low<=high 

//jdo nahi kari da then we do low<high   and high =mid;