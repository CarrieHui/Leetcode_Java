package iCoding;


/**
 * https://leetcode.com/problems/roman-to-integer/ (13. Roman to Integer)
 * @author carrieli
 *
 */
public class RomanToInt {
    public static void main(String[] args){
    	System.out.println(romanToInt("VII"));
    }
	
	public static int romanToInt(String s) {
		int result = 0;
		boolean isNextAnalyzed = false;

	    for(int i = 0; i < s.length() - 1; ++i){
	        if(isNextAnalyzed){
	           isNextAnalyzed = false;
	           continue;
	        }
	        int current = convert(s.charAt(i));
	        int next = convert(s.charAt(i+1));
	        if(current < next){
	            isNextAnalyzed = true;
	            result +=  next - current;
	        } else {
	            isNextAnalyzed = false;
	            result += current;
	        }
	    }
	    if(!isNextAnalyzed)
	        result += convert(s.charAt(s.length() - 1));
	    return result;
    }
	
	public static int convert(char ch){
		if(ch == 'I')
			return 1;
		else if(ch == 'V')
			return 5;
		else if(ch == 'X')
			return 10;
		else if(ch == 'L')
			return 50;
		else if(ch == 'C')
			return 100;
		else if(ch == 'D')
			return 500;
		else if(ch == 'M')
			return 1000;
		else
			return 0;
	}
}
