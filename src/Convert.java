package iCoding;

/**
 * https://leetcode.com/problems/zigzag-conversion/ (6. ZigZag Conversion)
 * @author carrieli
 *
 */
public class Convert {
	public static void main(String[] args){
		System.out.println(convert("PAYPALISHIRING", 3));
	}
	
	public static String convert(String s, int numRows) {
        int len = s.length();
		char[] z = new char[len];
		int k = 0, i, j, dinit = 2*(numRows-1), dvalue = dinit;
		int flag = 0;
		if(numRows == 1)
			dinit = 1;
		for(i=0; i<numRows; i++,dvalue-=2){
		    flag = 0;
			if(dvalue == 0)
				dvalue = dinit;
			for(j=i; j<len; ){
				z[k++] = s.charAt(j);
				if(dvalue == dinit){
					if(dvalue == 0)
						break;
					j += dvalue;
				}
				else{
					if(flag == 0){
						flag = 1;
						j += dvalue;
					}
					else{
						flag = 0;
						j += (dinit-dvalue);
					}
				}
			}
		}
		String result = String.copyValueOf(z);
		return result;
    }
}
