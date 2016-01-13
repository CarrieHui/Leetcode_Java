package iCoding;

/**
 * https://leetcode.com/problems/remove-element/ (27. Remove Element)
 * @author carrieli
 *
 */
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = {2,5,4,9,12,9,5,8,4,5,9,4,5,9};
		int len = removeElement(nums,9);
		System.out.println(len);
		for(int i=0; i<len; i++){
			System.out.print(nums[i] + "  ");
		}
	}
	
	public static int removeElement(int[] nums, int val){
		int len = nums.length;
		for(int i=0; i<len; ){
			if(nums[i] == val){
				nums[i] = nums[len-1];
				len --;
			}else
				i++;
		}
		return len;
	}
}
