/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    Map<Integer,Employee> emap;
    
    public int getImportance(List<Employee> employees, int id) {
//basically a way of acessing the employee through the employee id ! 
        
        emap = new HashMap();
        for (Employee e : employees ){
            emap.put(e.id,e);
        }
        return dfs(id);
        
        
    }
    int dfs(int id){
        Employee e  = emap.get(id);
        int ans = e.importance;
        for (Integer subId :e.subordinates )
            ans+=dfs(subId);
        
        return ans;
    }
}