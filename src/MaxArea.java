package iCoding;

import java.util.*;

/**
 * https://leetcode.com/problems/container-with-most-water/ (11. Container With Most Water)
 * @author carrieli
 *
 */
public class MaxArea {
	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the array:");
		n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter " + n +" integer numbers:");
		for(int i=0; i<n; i++){
			array[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("result:" + maxArea(array));
	}
	
	public static int maxArea(int[] height){
		int maxCon = 0;
		int con;
		int left = 0, right = height.length-1;
		while(left < right){
			con = ((height[left]<height[right])?height[left]:height[right]) * (right-left);
			maxCon = (maxCon>con)?maxCon:con;
			if(height[left] < height[right])
				left++;
			else
				right--;
		}
		return maxCon;
	}
}

