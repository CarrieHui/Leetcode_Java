package iCoding;

import java.util.List;
import java.util.LinkedList;

public class LetterCombinations {
	public static void recurCombine(int num, String[] map, String pre, List<String> ret, String digits){
		int index = digits.charAt(num) - '1';
		for(int i=0; i<map[index].length(); i++){
			if(num < digits.length()-1)
				recurCombine(num+1, map, pre+map[index].charAt(i), ret, digits);
			if(num == digits.length()-1)
				ret.add(pre+map[index].charAt(i));
		}
	}
	
	public static List<String> letterCombinations(String digits) {
        List<String> ret = new LinkedList<String>();
        if(digits.compareTo("") == 0)
			return ret;
        String[] map = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        recurCombine(0, map, "", ret, digits);
        return ret;
    }
	
	public static void main(String[] args){
		String digits = "2";
		List<String> ret = new LinkedList<String>();
		ret = letterCombinations(digits);
		for(String e : ret)
			System.out.println(e);
	}
}

