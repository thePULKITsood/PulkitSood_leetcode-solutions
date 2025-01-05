
 public class Solution {
    	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    	public List<String> letterCombinations(String digits) {
            
            if(digits.length()==0)
                return new ArrayList<String>();
    		List<String> ret = new LinkedList<String>();
            StringBuilder sb = new StringBuilder(); 
    		combination(  sb , digits, 0, ret);
    		return ret;
    	}
    
    	private void combination( StringBuilder sb, String digits, int offset, List<String> ret) {
    		if (offset >= digits.length()) {
    			ret.add(sb.toString());
    			return;
    		}
    		String letters = KEYS[(digits.charAt(offset) - '0')];
    		for (int i = 0; i < letters.length(); i++) {
    			combination(sb.append(letters.charAt(i)), digits, offset + 1, ret);
                sb.deleteCharAt(sb.length()-1);
    		}
    	}
    }
