package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/permutations/ (46. Permutations)
 * @author carrieli
 *
 */

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


/*
 public class FullPermu { 
	
	public static Set<String> set = new TreeSet<String>(); //TreeSet可以自动对元素排序再呈现出来
	
	// main函数
	public static void main(String args[]) {
		char[] number = new char[] { '1', '2', '3', '4', '5', '6'};
		perm(number, 0, number.length - 1);
		System.out.println(set.size());
		int cols = 10;
		for (String s : set) {
			System.out.print(s + " ");
			if (cols-- == 1) {
				System.out.println();
				cols = 10;
			}
		}
	}
	
	public static void perm(char[] n, int beg, int end) {
		if (beg == end) {
			addNumber(String.valueOf(n));
		} else {
			for (int i = beg; i <= end; ++i) {
				swap(n, beg, i);
				perm(n, beg + 1, end);
				swap(n, beg, i);
			}
		}
	} 
	
	// 如果x,y二者对应位置元素不同，则交换
	public static void swap(char[] n, int x, int y) {
		if (n[x] == n[y]) {
			return;
		}
		char temp = n[x];
		n[x] = n[y];
		n[y] = temp;
	} 
	
	// 将满足给定条件的序列添加到集合set中
	public static void addNumber(String str) {
		
		set.add(str);
	} 
}
 */
