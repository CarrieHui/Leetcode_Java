package iCoding;

public class Rob {
	public static void main(String[] args){
		int[] nums = {8, 5, 9, 3, 1, 20};
		int max = rob(nums);
		System.out.println(max);
	}
	
	public static int rob(int[] nums) {
        int robNo = 0; //不抢当前这家的最大值，即前一轮中的robNo robYes的最大值
        int robYes = 0; //抢劫当前这家的最大值，即前一轮中的robNo加上当前屋内的财富值
        int temp;
        for(int e : nums){
        	temp = robNo;
        	robNo = Math.max(robNo, robYes);
        	robYes = temp + e;
        }
        return Math.max(robNo, robYes);
    }
}
