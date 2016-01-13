package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/palindrome-number/ (9. Palindrome Number)
 * @author carrieli
 *
 */
public class Palindrome {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		if(x < 0)
			System.out.println("false!");
		else{
			int len = String.valueOf(x).length();
			int div1 = (int) Math.pow(10,len-1);
			int div2 = 10;
			int div3 = 1;
			while(div1 >= div2){
				if((x/div1) != ((x%div2)/div3)){
					System.out.println("false");
					System.exit(0);
				}
				else{
					x %= div1;
					div1 /= 10;
					div2 *= 10;
					div3 *= 10;
				}
			}
			System.out.println("true!");
		}
	}
}
