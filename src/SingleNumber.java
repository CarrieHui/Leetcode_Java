package iCoding;

/**
 * https://leetcode.com/problems/single-number/ (136. Single Number)
 * @author carrieli
 *
 */

public class SingleNumber {
	public static void main(String[] args){
		int[] nums = {3, 5, 6, 5, 3, 1, 1};
		System.out.println(singleNumber(nums));
	}
	
	//异或 (xor)
    public static int singleNumber(int[] nums) {
        for(int i=1; i<nums.length; i++)
        	nums[0] ^= nums[i];
        return nums[0];
    }
}
