package iCoding;

/**
 * https://leetcode.com/problems/search-insert-position/ (35. Search Insert Position)
 * @author carrieli
 *
 */

public class SearchInsert {
	public static void main(String[] args){
		int[] nums = {1, 3, 5, 6};
		System.out.println(search(nums, 5));
		System.out.println(search(nums, 2));
		System.out.println(search(nums, 7));
		System.out.println(search(nums, 0));
	}
	
	public static int search(int[] nums, int target){
		int index = -1;
		int left = 0, right = nums.length-1; 
		int mid = 0;
		while(right >= left){
			mid = (left + right) /2;
			if(nums[mid] < target)
				left = mid + 1;
			else if(nums[mid] > target)
				right = mid - 1;
			else{
				index = mid;
				break;
			}
		}
		if(index == -1){
			if(nums[mid] > target)
				index = mid;
			else
				index = mid + 1;
		}
		
		return index;
	}
}