// class Solution {
//     public boolean isPowerOfFour(int n) {
//       // convert the integer to base 4 then -> look if the answer is all zero or not   
        
//         // base 10. to base 4 
        
        
        
//     }
// }
class Solution {
  public boolean isPowerOfFour(int num) {
    return (num > 0) && (Math.log(num) / Math.log(2) % 2 == 0);
  }
}