package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/bulls-and-cows/ (299. Bulls and Cows)
 * @author carrieli
 * 
 */
public class GetHint {
	public static void main(String[] args){
		System.out.println(getHint("1123","1132"));
	}

	public static String getHint(String secret, String guess) {
		int len = secret.length();
		int[] nums = new int[len];
		int hint_a = 0;
		int hint_b = 0;
		
		for(int i=0; i<len; i++){
			if(guess.charAt(i) == secret.charAt(i)){
				hint_a++;
				nums[i] = -1;
			}
		}
		
		int[] nums_s = new int[len-hint_a];
		int[] nums_g = new int[len-hint_a];
		int j = 0;
		
		for(int i=0; i<len; i++){
			if(nums[i] != -1){
				nums_s[j] = secret.charAt(i);
				nums_g[j] = guess.charAt(i);
				j++;
			}
		}
		
		Arrays.sort(nums_s);
		Arrays.sort(nums_g);
		for(int s=0,g=0; s<len-hint_a && g<len-hint_a; ){
			while(g<len-hint_a && nums_g[g]<nums_s[s])
				g++;
			if(g == len-hint_a)
				break;
			while(s<len-hint_a && nums_g[g]>nums_s[s])
				s++;
			if(s == len-hint_a)
				break;
			if(nums_g[g] == nums_s[s]){
				hint_b++;
				g++;
				s++;
			}
		}
		
        return hint_a+"A"+hint_b+"B";
    }
}
