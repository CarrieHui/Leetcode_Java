package iCoding;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/happy-number/ (202. Happy Number)
 * @author carrieli
 *
 */
public class HappyNumber {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		if(n == 1){
			System.out.println("true");
			System.exit(0);
		}
		int sum = 0;
		int x=n, y=n;
		while(sum != 1){
			x = squareSum(x);
			if(x == 1){
				System.out.println("true");
				System.exit(0);
			}
			y = squareSum(squareSum(y));
			if(y == 1){
				System.out.println("true");
				System.exit(0);
			}
			if(x == y){
				System.out.println("false");
				System.exit(0);
			}
			
		}
	}
	
	public static int squareSum(int n){
		int sum = 0;
		while(n != 0){
			sum += (n%10) * (n%10);
			n /= 10;
		}
		return sum;
	}
}
