package iCoding;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/ (3. Longest Substring Without Repeating Characters)
 * @author carrieli
 *
 */
public class LengthOfLongestSubstring {
	public static void main(String[] args){
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int len = 1, max = 1;
		int i=0,j=1;
		int loc = 0;
		if(s.equals("")){
			return 0;
		}
		String subs = new String();
		for( ; i<s.length(); i++){
			for( ; j<=s.length(); j++){
				subs = s.substring(i, j);
				if(j != s.length()){
					loc =  subs.indexOf(s.charAt(j));
				}else{
					loc = -2;
				}
				if(loc == -1){
					len ++;
				}else{
					if(len > max){
						max = len;
					}
					len = len - loc;
					i = loc + i;
					j = j + 1;
					break;
				}
			}
		}
		return max;
    }
}
