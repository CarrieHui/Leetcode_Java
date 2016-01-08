package iCoding;

public class MissingNumber {
	public static void main(String[] args){
		int[] nums = {0, 1, 2, 3, 4, 5, 7};
		int missNum = missingNumber(nums);
		System.out.println(missNum);
	}
	
	 public static int missingNumber(int[] nums) {
		 int n = nums.length;
		 int sum = 0;
		 int total = (n * (n + 1)) / 2;
		 for(int e : nums){
			 sum += e;
		 }
		 return total-sum;
	 }
}
