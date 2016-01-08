package iCoding;

public class TimeoutGetPermutation {
	public static void main(String[] args){
		System.out.println(getPermutation(3, 2));
	} 
	
	public static String getPermutation(int n, int k) {
		int[] nums = new int[n];
		for(int i=1; i<=n; i++)
			nums[i-1] = i; 
		String str = "";
		int[] cur = {0};
		permuteRecur(nums, k, cur, 0);
		for(int e : nums)
			str += e;
		return str;
	}
	
	public static void permuteRecur(int[] nums, int k, int[] cur, int begin){
		if(begin == nums.length-1){
			cur[0]++;
			return;
		}
		
		for(int i=begin; i<nums.length; i++){
			int temp = nums[begin];
			nums[begin] = nums[i];
			nums[i] = temp;
			
			permuteRecur(nums, k, cur, begin+1);
			if(k == cur[0])
				break;
			
			temp = nums[begin];
			nums[begin] = nums[i];
			nums[i] = temp;
		}
	}
}
