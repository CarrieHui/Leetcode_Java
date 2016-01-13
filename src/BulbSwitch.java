package iCoding;

/**
 * https://leetcode.com/problems/bulb-switcher/ (319. Bulb Switcher)
 * @author carrieli
 *
 */
public class BulbSwitch {
	public static void main(String[] args){
		int n = 9999999;
		int total = bulbSwitch(n);
		System.out.print(total);
	}
	
	public static int bulbSwitch(int n ){
		/*
		int total = 0;
		int[] bulbs = new int[n];
		for(int i=1; i<n+1; i++){
			for(int j=i; j<n+1; j=j+i)
				bulbs[j-1] = (bulbs[j-1] + 1) % 2;
		}
		for(int i=0; i<n; i++)
			total += bulbs[i];
		return total;
		*/
		return (int)(Math.sqrt(n));
	}
}
