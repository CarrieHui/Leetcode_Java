package iCoding;

/**
 * https://leetcode.com/problems/add-digits/ (258. Add Digits)
 * @author carrieli
 *
 */

public class AddDigits {
	public static void main(String[] args){
		System.out.println(addDigits(99998));
	}
	
	public static int addDigits(int num){
		int i = num % 9;
		return i==0?(num<10?num:9):i;
	}
}
