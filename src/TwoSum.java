package iCoding;

import java.util.*;


/**
 * https://leetcode.com/problems/two-sum/ (1. Two Sum)
 * @author carrieli
 *
 */
public class TwoSum {
	public static void main(String[] args){
		int[] a = new int[2];
		int[] numbers = {3, 2, 5, 7};
		int target = 10;
		a = twoSum(numbers, target);
		System.out.println(a[0] + " " + a[1]);
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int i,j,k,temp;
        int[] index = {0,0};
        int[] num_sort = numbers.clone();
        Arrays.sort(num_sort);
        for(i=0,j=num_sort.length-1 ; ;){
            if(num_sort[i]+num_sort[j]<target){
				i++;
			}else if(num_sort[i]+num_sort[j]>target){
				j--;
			}else{
				break;
			}
        }
        for(k=0; ;k++){
            if(num_sort[i]==numbers[k]){
                index[0]=k+1;
                break;
            }
        }
        for(k=0; ;k++){
            if(k!=index[0]-1 && num_sort[j]==numbers[k]){
                index[1]=k+1;
                break;
            }
        }
		if(index[0] > index[1]){
			temp = index[0];
			index[0] = index[1];
			index[1] = temp;
		}
		return index;
    }
}
