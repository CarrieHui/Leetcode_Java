package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/permutation-sequence/ (60. Permutation Sequence)
 * @author carrieli
 *
 */

public class GetPermutation {
	public static void main(String[] args){
		System.out.println(getPermutation(8, 1));
	}
	
	
	public static String getPermutation(int n, int k){
		k--;
		String str = "";
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=n; i++)
			list.add(i);
		int[] fact = new int[n];  //factorial
		fact[0] = 1;
		for(int i=1; i<n; i++)
			fact[i] = fact[i-1] * (i+1);
		
		while(n > 1){
			int index = k / fact[n-2];
			str += list.remove(index);
			k = k % fact[n-2];
			n--;
		}
		str += list.remove(0);
		
		return str;
	}
	
	/*
	public static int factorial(int n){
		int result = 1;
		while(n > 0){
			result *= n;
			n--;
		}
		return result;
	}
	*/

}
