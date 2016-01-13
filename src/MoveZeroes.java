package iCoding;

/**
 * https://leetcode.com/problems/move-zeroes/ (283. Move Zeroes)
 * @author carrieli
 *
 */

public class MoveZeroes {
	public static void main(String[] args){
		int[] nums = {};
		moveZeroes(nums);
		for(int e: nums){
			System.out.println(e);
		}
	}
	
	public static void moveZeroes(int[] nums){
		int len = nums.length;
		int nonZeroNum = 0;
		int flag = 0;
		for(int i=0; i<len; i++){
			if(nums[i] != 0)
				if(nonZeroNum != i){
					nums[nonZeroNum++] = nums[i];
					flag = 1;
				}
				else
					nonZeroNum++;
		}
		if(flag == 1 && nonZeroNum < len){
			for(int i=nonZeroNum; i<len; i++)
				nums[i] = 0;
		}
	}
}
