package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/ugly-number-ii/ (264. Ugly Number II)
 * @author carrieli
 *
 */

class NthUglyNumber{
	public static void main(String args[]){
		int number = nthUglyNumber(27);
		System.out.println(number);
	}

	public static int nthUglyNumber(int n){
		if(n < 0)
			return 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int a=0, b=0, c=0;
		int next;
		while(list.size() < n){
			next = Math.min(list.get(a)*2, Math.min(list.get(b)*3, list.get(c)*5));
			if(next != list.get(list.size()-1))
				list.add(next);
			if(next == list.get(a) * 2)
				a++;
			else if(next == list.get(b) * 3)
				b++;
			else
				c++;
		}
		return list.get(n-1);
	}
}

