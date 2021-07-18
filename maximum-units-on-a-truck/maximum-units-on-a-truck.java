class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes ,(a,b)-> b[1] - a[1]);
        int unit  = 0;
        
        for (int[] arr: boxTypes){
            int noofboxes = Math.min(truckSize , arr[0]);
            unit += noofboxes*arr[1];
            
            truckSize -= noofboxes;
            if(truckSize == 0)
                break;
        }
        return unit;
    }
}