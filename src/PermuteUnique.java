package iCoding;

import java.util.*;

public class PermuteUnique {
	public static void main(String[] args){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] nums = {1, 1, 2, 2};
		//排序
		
		list = permuteUnique(nums);
		for(List<Integer> li : list){
			for(int e : li)
				System.out.print(e+" ");
			System.out.println();
		}
	}
	
	public static List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		permuteRecur(list, nums, 0);
		return list;
    }
	
	public static void permuteRecur(List<List<Integer>> list, int[] nums, int begin){
		if(begin == nums.length-1){
			List<Integer> numsList = new LinkedList<Integer>();
			for(int e : nums)
				numsList.add(e);
			list.add(numsList);
			return;
		}
		
		for(int i=begin; i<nums.length; i++){
			//if( (begin==i) || (begin!=i && nums[begin]!=nums[i] && nums[i]!=nums[i-1]) ){
			if( (begin==i) || (begin!=i && nums[begin]!=nums[i]) ){
				int temp = nums[begin];
				nums[begin] = nums[i];
				nums[i] = temp;
			
				permuteRecur(list, nums, begin+1);
			
				temp = nums[begin];
				nums[begin] = nums[i];
				nums[i] = temp;
			}
		}
	}
}
