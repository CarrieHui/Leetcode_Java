package iCoding;

public class IntToRoman {
	public static void main(String[] args){
		String roman = intToRoman(22);
		System.out.println(roman);
	}
	
	public static String intToRoman(int num) {
        String roman = "";
        int[] baseInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] baseSymbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i=0; i<13; i++){
        	if(num >= baseInt[i]){
        		int len = num / baseInt[i];
        		while(len-- != 0)
        			roman += baseSymbol[i];
        		num = num % baseInt[i];
        		if(num == 0)
        			break;
        	}
        }
        return roman;
    }
}
