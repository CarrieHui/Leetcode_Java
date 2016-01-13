package iCoding;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/ (20. Valid Parentheses)
 * @author carrieli
 *
 */

public class IsValid {
	public static void main(String[] args){
		String str = "{})";
		System.out.println(isValid(str));
	}
	
	public static boolean isValid(String str){
		int len = str.length();
		Stack<Character> st = new Stack<Character>();
		//Stack st = new Stack(len+1);
		st.push('#');
		for(int i=0; i<len; i++){
			char ch = str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{')
				st.push(ch);
			else{
				char ch1 = st.pop();
				if(ch==')' && ch1!='(')
					return false;
				else if(ch==']' && ch1!='[')
					return false;
				else if(ch=='}' && ch1!='{')
					return false;
			}
		}
		if(st.pop() == '#')
			return true;
		else
			return false;
	}
}
