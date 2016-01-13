package iCoding;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/ (26. Remove Duplicates from Sorted Array)
 * @author carrieli
 *
 */

public class RemoveDuplicates {
	public static void main(String[] args){
		int len;
		int[] nums = {};
		len = removeDuplicates(nums);
		System.out.println("length = " + len);
		for(int i=0; i<len; i++)
			System.out.println(nums[i]);
	}
	
	public static int removeDuplicates(int[] nums){
		int len;
		len = nums.length;
		if(len == 0)
			return 0;
		int i=0;
		for(int j=1; j<len; j++){
			if(nums[j] != nums[i]){
				i++;
				if(j != i)
					nums[i] = nums[j]; 
			}
		}
		return i+1;
	}
}
