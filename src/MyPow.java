package iCoding;

/**
 * https://leetcode.com/problems/powx-n/ (50. Pow(x, n))
 * @author carrieli
 *
 */

public class MyPow {
	public static void main(String[] args){
		System.out.println(myPow(2, -2));
		System.out.println(myPow(5, 3));
	}
	
	public static double myPow(double x, int n) {
        if(n == 0)
			return 1;
		else{
			double half = myPow(x, n/2);
			if(n % 2 == 0)
				return half * half;
			else{
				if(n > 0)
					return half * half * x;
				else
					return half * half / x;
			}
		}
    }
}
