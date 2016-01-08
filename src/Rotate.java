package iCoding;

public class Rotate {
	public static void main(String[] args){
		int[][] img = {
				{3, 5, 9, 3},
				{2, 1, 8, 6},
				{4, 9, 5, 3},
				{4, 3, 2, 1}
		};
		rotate(img);
		for(int i=0; i<img.length; i++){
			for(int j=0; j<img[i].length; j++)
				System.out.print(img[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void rotate(int[][] matrix){
		int n = matrix.length;
		for(int i=0; i<n/2; i++){
			for(int j=i; j<n-1-i; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
	}
}
