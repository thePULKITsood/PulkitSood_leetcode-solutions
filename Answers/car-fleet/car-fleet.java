class Solution {
    class car{
        int pos;
        double timeToTarget;
        
        car(int pos ,double time){
            this.pos = pos;
            this.timeToTarget = time;
            
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        
        int n = speed.length;
        if(n==0)return 0;
        car cars[]=new car[n];
        for (int i=0;i<n;i++){
            cars[i]=new car(position[i],(target-position[i])*1.0 /speed[i]);
        }
        Arrays.sort(cars,(a,b)-> a.pos-b.pos);
        int ans =0;
        
        for (int i=n-1;i>=1;i-- ){
            if(cars[i].timeToTarget>= cars[i-1].timeToTarget)
                cars[i-1]=cars[i];
            else 
                ans++;
        }
        return ans+1;
    }
}