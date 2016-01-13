package iCoding;

/**
 * https://leetcode.com/problems/rectangle-area/ (223. Rectangle Area)
 * @author carrieli
 *
 */
public class ComputeArea {
	public static void main(String[] args) {
		int A=-1500000001, B=0, C=-1500000000, D=1, E=1500000000, F=0, G=1500000001, H=1;
		System.out.println(computeArea(A, B, C, D, E, F, G, H));
	}
	
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H){
		int area1 = (C-A) * (D-B);
		int area2 = (G-E) * (H-F);
		
		int overlap = 0;
		int a = Math.max(A, E);
		int b = Math.min(C, G);
		int c = Math.max(B, F);
		int d = Math.min(D, H);
		if(b>a && d>c)
			overlap = (b-a) * (d-c);
		return area1+area2-overlap;
	}
}
