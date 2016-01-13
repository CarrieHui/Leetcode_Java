package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/count-and-say/ (38. Count and Say)
 * @author carrieli
 *
 */

/*
public class CountAndSay {
	public static void main(String[] args) {
		int n = 4;
		char now, next;
		int count = 1;
		StringBuilder queue = new StringBuilder();
		queue.append('1');
		while(n-1 > 0){
			int size = queue.length();
			next = queue.charAt(0);
			while(size > 0){
				now = next;
				queue.deleteCharAt(0);
				if(size != 1)
					next = queue.charAt(0);
				else
					next = '0';
				if(now == next)
					count++;
				else{
					queue.append(count);
					queue.append(now);
					count = 1;
				}
				size--;
			}
			n--;
		}
		System.out.println(queue.toString());
	}
}
*/


public class CountAndSay {
	public static void main(String[] args) {
		int n = 4;
		int now, next;
		int count = 1;
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(1);
		while(n-1 > 0){
			int size = queue.size();
			next = (int)queue.getFirst();
			while(size > 0){
				now = next;
				queue.remove();
				
				if(size != 1)
					next = (int)queue.getFirst();
				else
					next = -1;
				
				if(now == next)
					count++;
				else{
					queue.add(count);
					queue.add(now);
					count = 1;
				}
				
				size--;
			}
			n--;
		}
		
		System.out.println(queue);
	}
}


