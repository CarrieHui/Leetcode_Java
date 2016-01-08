package iCoding;

public class CoinChange {
	
	public static void main(String[] args){
		int[] coins = {1, 2, 5};
		int amount = 11;
		int fewestNum = coinChange(coins, amount);
		System.out.println(fewestNum);
	}
	
	public static int coinChange(int[] coins, int amount) {  //递归？
	    int len = coins.length;
	    int[] result = new int[len];
	    int coinsNum = 0;
	    for(int i=0; i<len; i++){
	    	int shang = amount / coins[i];
	    	
	    }
		return coinsNum;
	}
}
