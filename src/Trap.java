package iCoding;

/**
 * https://leetcode.com/problems/trapping-rain-water/ (42. Trapping Rain Water)
 * @author carrieli
 *
 */

public class Trap{
	public static void main(String[] args){
		int[] h1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};   // areas = 6
		int[] h2 = {1, 0, 2, 0, 1, 1, 3, 2, 1, 0, 1, 2, 1, 0, 1}; 
		int[] h3 = {5, 4, 1, 2};
		System.out.println(trap(h1));
		System.out.println(trap(h2));
		System.out.println(trap(h3));
	}
	
    public static int trap(int[] height) {
    	int area = 0;
    	int left = 0;
    	int right = height.length-1;
    	int max = -1;
    	while(left <= right){
    		if(height[left] <= height[right]){
    			if(height[left] > max)
    				max = height[left];
    			else
    				area += max-height[left];
    			left++;
    		}
    		else{
    			if(height[right] > max)
    				max = height[right];
    			else
    				area += max-height[right];
    			right--;
    		}
    	}
    	return area;
    }
}

/* 超时
    public static int trap(int[] height) {
        int areas = 0;
        List<Integer> peaks = new ArrayList<Integer>();  // 存放波峰的下标
        if(height.length >= 2){
	        //寻找波峰
	        if(height[0]-height[1] > 0)
	        	peaks.add(0);
	        for(int i=1; i<height.length-1; i++){
	        	if(height[i]-height[i+1]>0 && height[i]-height[i-1]>0)
	        		peaks.add(i);
	        }
	        if(height[height.length-1]-height[height.length-2] > 0)
	        	peaks.add(height.length-1);
	        
	        int i, j;
	        for(i=0; i<peaks.size()-1; ){
	        	int flag = 0;
	        	for(j=i+1; j<peaks.size(); j++){
	        		if(height[peaks.get(j)] >= height[peaks.get(i)]){
	        			flag = 1;
	        			break;
	        		}
	        	}
	        	if(flag == 0)
	        		j = i+1;
	        	areas += getArea(height, peaks.get(i), peaks.get(j));
	        	i = j;
	        }
        }
        return areas;
    }
    public static int getArea(int[] height, int i, int j){
    	int area = 0;
    	int min = Math.min(height[i], height[j]);
    	for(int e=i+1; e<j; e++){
    		if(min - height[e] >= 0)
    			area += (min-height[e]);
    	}
    	return area;
    }
*/
