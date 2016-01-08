package iCoding;

public class NimGame {
	public static void main(String[] args){
		int n = 4;
		boolean can = canWin(n);
		System.out.println(can);
	}
	
	public static boolean canWin(int n){
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
