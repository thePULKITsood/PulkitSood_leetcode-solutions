class Solution {
 
    HashSet <Integer> daySet=new HashSet();
    int n;
    int memo[];
    
    public int mincostTickets(int[] days, int[] cost) {
        n = days.length;
        for (int d : days)daySet.add(d);
    
        memo = new int [days[n-1]+1];
        
        return rec (days[0],cost,days);
        
    }
    public int rec (int day , int []cost, int days[]){
 
        if(day>days[n-1]) return 0;
        if(memo[day]!=0)return memo[day];
        int ans= Integer.MAX_VALUE;
        
        if(daySet.contains(day)){
        
            int one =rec(day+1 , cost, days) + cost[0];
            int week = rec(day+7,cost,days)+cost[1];
            int month =rec(day+30,cost,days)+cost[2];
            
             ans = Math.min(one,Math.min(week,month));
        }
        else return rec(day+1,cost,days);
        
        return memo[day]= ans;
        
    }
}