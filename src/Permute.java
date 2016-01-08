package iCoding;

import java.util.*;

public class Permute {
	public static void main(String[] args){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] nums = {1, 2, 4};
		list = permute(nums);
		for(List<Integer> li : list){
			for(int e : li)
				System.out.print(e+" ");
			System.out.println();
		}
	} 
	
	public static List<List<Integer>> permute(int[] nums) {
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
			int temp = nums[begin];
			nums[begin] = nums[i];
			nums[i] = temp;
			
			permuteRecur(list, nums, begin+1);
			
			temp = nums[begin];
			nums[begin] = nums[i];
			nums[i] = temp;
		}
	}
	
	
	/*
	 * 方法一
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> numsList = new ArrayList<Integer>();
		for(int e : nums)
			numsList.add(e);
		List<Integer> li = new LinkedList<Integer>();
		addNum(list, li, numsList);
		return list;
    }
	
	public static void addNum(List<List<Integer>> list, List<Integer> li, List<Integer> numsList){
		if(numsList.isEmpty()){
			list.add(li);
			for(int i=0; i<li.size(); i++)
				System.out.print(li.get(i)+" ");
			System.out.println();
		}
		for(int i=0; i<numsList.size(); i++){
			li.add(numsList.get(i));
			int e = numsList.remove(i);
			addNum(list, li, numsList);
			numsList.add(i, e);
			li.remove(numsList.get(i));
		}
	}
	*/
}
