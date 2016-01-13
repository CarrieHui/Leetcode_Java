package iCoding;


/**
 * https://leetcode.com/problems/nim-game/ (292. Nim Game)
 * @author carrieli
 *
 */
public class CanWinNim {
	public static void main(String[] args){
		int n = 4;
		boolean can = canWinNim(n);
		System.out.println(can);
	}
	
	public static boolean canWinNim(int n){
		if(n <= 0)
			return false;
		else{
			if(n % 4 == 0)
				return false;
			else
				return true;
		}
	}
}
