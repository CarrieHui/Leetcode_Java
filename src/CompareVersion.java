package iCoding;

/**
 * https://leetcode.com/problems/compare-version-numbers/ (165. Compare Version Numbers My Submissions Question
)
 * @author carrieli
 *
 */

public class CompareVersion {
	public static void main(String args[]){
		System.out.println(compareVersion("1.0.1", "1"));
	}
	
	public static int compareVersion(String version1, String version2){
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int len1 = v1.length;
		int len2 = v2.length;
		//System.out.println(len1);
		//System.out.println(len2);
		int i;
		for(i=0; i<len1&&i<len2; i++){
			if( strToInt(v1[i]) < strToInt(v2[i]) )
				return -1;
			else if( strToInt(v1[i]) > strToInt(v2[i]) )
				return 1;
		}
		//System.out.println(i);
		if(i==len1 && i!=len2){
			//if(i+1==len2 && strToInt(v2[i])==0)
			int j;
			for(j=i; j<len2; j++){
				if(strToInt(v2[j])!=0)
					return -1;
			}
			return 0;
		}
		else if(i!=len1 && i==len2){
			//if(i+1==len1 && strToInt(v1[i])==0)
			int j;
			for(j=i; j<len1; j++){
				if(strToInt(v1[j])!=0)
					return 1;
			}
			return 0;
		}
		else
			return 0;		
	}
        
    public static int strToInt(String str){
    	int len = str.length();
    	int num = 0;
    	int base = 1;
    	for(int i=1; i<=len; i++){
    		num += (str.charAt(len-i)-'0') * base;
    		base *= 10;
    	}
    	
    	return num;
    }
}
