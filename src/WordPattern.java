package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/word-pattern/ (290. Word Pattern)
 * @author carrieli
 *
 */
public class WordPattern {
	public static void main(String[] args){
		String pattern = "abba";
		String str = "hi he he hi";
		System.out.println(wordPattern(pattern, str));	
	}
	
	public static boolean wordPattern(String pattern, String str) {
		String[] str_split = str.split(" ");
		String[] alph = new String[26];
		int num = str_split.length;
		int num1 = pattern.length();
		List<String> al = new ArrayList<>();
		
		if(num != num1)
			return false;
		for(int i=0; i<num; i++){
			char ch = pattern.charAt(i);
			if(alph[ch-'a'] == null){
				if(al.contains(str_split[i]))
					return false;
				alph[ch-'a'] = str_split[i];
				al.add(str_split[i]);
			}
			else{
				/*
				if(alph[ch-'a'] != str_split[i])
					return false;
				*/
				if(alph[ch-'a'].equals(str_split[i]) == false)
					return false;
			}
		}
		return true;
	}
}
