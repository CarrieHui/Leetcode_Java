package iCoding;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-closest/ (16. 3Sum Closest)
 * @author carrieli
 *
 */

public class ThreeSumClosest {
	public static void main(String[] args){
		int[] nums = {-1, 2, 1, -4};
		int target = -5;
		System.out.println(threeSumClosest(nums, target));
	}
	
	public static int threeSumClosest(int[] nums, int target) {
		int len = nums.length;
        int ctarget = nums[0] + nums[1] + nums[len-1];
        if(ctarget == target)
        	return ctarget;
         Arrays.sort(nums);
         for(int i=0; i<len-2; i++){
        	 int start = i+1;
        	 int end = len-1;
        	 while(start < end){
	        	 int sum = nums[i] + nums[start] + nums[end];
	        	 if(sum == target)
	        		 return sum;
	        	 else if(sum < target)
	        		 start++;
	        	 else
	        		 end--;
	        	 
	        	 if(Math.abs(sum-target) < Math.abs(ctarget-target))
	        		 ctarget = sum;
        	 }	 
         }
        return ctarget;
    }
}
