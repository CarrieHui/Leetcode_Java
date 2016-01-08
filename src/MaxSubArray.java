package iCoding;

public class MaxSubArray {
	public static void main(String[] args){
		int[] nums = {-2, -3, -1, -5};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
        int max = nums[0];  //存储当前最大子序列之和
        int subSum = 0;  //计算所有和大于0的子序列之和，若大于max，将其替换。若小于0，置0
        for(int e : nums){
        	subSum += e;
        	max = Math.max(max, subSum);
        	if(subSum < 0)
        		subSum = 0;
        }
        return max;
    }
}
