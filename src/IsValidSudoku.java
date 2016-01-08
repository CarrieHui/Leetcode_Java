package iCoding;

public class IsValidSudoku {
	public static void main(String[] args){
		char[][] board = {
				{'.', '.', '4', '.', '.', '.', '6', '3', '.'},
				{'5', '.', '.', '.', '.', '.', '.', '9', '.'},
				{'.', '.', '.', '5', '6', '.', '.', '.', '.'},
				{'4', '.', '3', '.', '.', '.', '.', '.', '1'},
				{'.', '.', '.', '7', '.', '.', '.', '.', '.'},
				{'.', '.', '.', '5', '.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.', '.', '.', '.', '.'}
		};
		System.out.println(isValidSudoku(board));
	}
	
	public static boolean isValidSudoku(char[][] board){
		boolean valid = false;
		int i, j;
		for(i=0; i<9; i++){
			valid = checkRow(board, i);
			if(valid == false)
				return false;
		}
		for(j=0; j<9; j++){
			valid = checkColumn(board, j);
			if(valid == false)
				return false;
		}
		for(i=0; i<9; i=i+3){
			for(j=0; j<9; j=j+3){
				valid = checkGrid(board, i, j);
				if(valid == false)
					return false;
			}
		}
		
		return true;
	}
	
	public static boolean checkRow(char[][] board, int row){
		int[] flag = new int [9];
		for(int j=0; j<9; j++){
			if(board[row][j] != '.')
				if(flag[board[row][j] - '1'] == 1)
					return false;
				else
					flag[board[row][j] - '1'] = 1;
		}
		return true;
	}
	
	public static boolean checkColumn(char[][] board, int col){
		int[] flag = new int [9];
		for(int i=0; i<9; i++){
			if(board[i][col] != '.')
				if(flag[board[i][col] - '1'] == 1)
					return false;
				else
					flag[board[i][col] - '1'] = 1;
		}
		return true;
	}

	public static boolean checkGrid(char[][] board, int row, int col){
		int[] flag = new int [9];
		for(int i=row; i<row+3; i++){
			for(int j=col; j<col+3; j++){
				if(board[i][j] != '.'){
					if(flag[board[i][j] - '1'] == 1)
						return false;
					else
						flag[board[i][j] - '1'] = 1;
				}
			}
		}
		return true;
	}
}
