package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/generate-parentheses/ (22. Generate Parentheses)
 * @author carrieli
 *
 */
public class GenerateParenthesis {
	public static void main(String[] args){
		List<String> myList = new ArrayList<String>();
		myList = generateParenthesis(4);
		for(String e : myList)
			System.out.println(e);
	}
	
	public static List<String> generateParenthesis(int n) {
        List<String> myList = new ArrayList<String>();
        add(myList, "", n, 0);
        return myList;
    }
	
	public static void add(List<String> myList, String str, int remain, int unmatch){
		if(remain==0 && unmatch==0)
			myList.add(str);
		else{
			if(remain > 0)
				add(myList, str+"(", remain-1, unmatch+1);
			if(unmatch > 0)
				add(myList, str+")", remain, unmatch-1);
		}
	}
}
