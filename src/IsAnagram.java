package iCoding;

/**
 * https://leetcode.com/problems/valid-anagram/ (242. Valid Anagram)
 * @author carrieli
 *
 */

public class IsAnagram {
	public static void main(String[] args){
		System.out.println(isAnagram("anagran", "nagaram"));
	}
	
	public static boolean isAnagram(String s, String t) {
        int[] alph = new int[64];
        if(s.length() != t.length())
        	return false;
        for(int i=0; i<s.length(); i++)
        	alph[s.charAt(i)-'a']++;
        for(int i=0; i<t.length(); i++)
        	alph[t.charAt(i)-'a']--;
        for(int e : alph){
        	if(e != 0)
        		return false;
        }
        return true;
    }
}
