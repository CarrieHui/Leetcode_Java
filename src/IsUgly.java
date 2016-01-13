package iCoding;

/**
 * https://leetcode.com/problems/ugly-number/ (263. Ugly Number)
 * @author carrieli
 *
 */

public class IsUgly {

	public static void main(String args[]){
		int num = 60;
		boolean flag = isUgly(num);
		System.out.println(flag);
	}
	
	public static boolean isUgly(int num) {
		// List<Integer> a = new ArrayList<Integer>();
		if(num > 0){
			int[] array = {2, 3, 5};
			for(int i=0; i<3; i++){
		        int r = num % array[i];
		        int temp = num / array[i];
		        while(r == 0){
		        	num = temp;
		        	r = num % array[i];
			        temp = num / array[i];
		        }
			}
			if(num == 1)
				return true;
			else
				return false;
		}
		else
			return false;
    }
}
