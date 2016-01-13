package iCoding;

/**
 * https://leetcode.com/problems/excel-sheet-column-title/ (168. Excel Sheet Column Title)
 * @author carrieli
 *
 */

public class ConvertToTitle {
	public static void main(String[] args) {
		System.out.println(convertToTitle(30));
		System.out.println(titleToNumber("AD"));
	}
	
	public static String convertToTitle(int n){
		if(n == 0)
			return "";
		String str = convertToTitle((n-1)/26);
		char ch = (char)('A'+(n-1)%26);
		return str+ch;
	}
	
	public static int titleToNumber(String s){
		int n = 0, baseNum = 1;
		int len = s.length();
		char ch;
		while(len > 0){
			ch = s.charAt(len-1);
			n += (ch-'A'+1)*baseNum;
			baseNum *= 26;
			len --;
		}
		return n;
	}
}
