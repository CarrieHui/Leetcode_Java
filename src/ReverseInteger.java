package iCoding;

/**
 * https://leetcode.com/problems/reverse-integer/ (7. Reverse Integer)
 * @author carrieli
 *
 */
public class ReverseInteger {
	public static void main(String[] args){
		System.out.println(reverse(123));
		System.out.println(reverse(-321));
	}
	
	public static int reverse(int x) {
		int n = x;
		long reverse = 0;
		int len = 0;
		while(n != 0){
			len ++;
			n /= 10;
		}
		n = x;
		while(len != 0){
			reverse += (long)((n%10) * Math.pow(10, len-1));
			n /= 10;
			len --;
		}
		if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
			return 0;
		else
			return (int)reverse;
    }
}
