package iCoding;

public class GameOfLife {
	
	public static void main(String args[]){
		int[][] board = {
			{1,0,0,0,1},
			{0,0,1,1,0},
			{1,1,0,0,0},
			{0,1,1,0,0},
			{0,0,0,0,1},		
		};
		gameOfLife(board);
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[i].length; j++)
				System.out.printf("%5d", board[i][j]);
			System.out.println();
		}
	}
	
	
    public static void gameOfLife(int[][] board) {
 
        int r=board.length, c;
        if(board.length == 0)
        	return;
        
        for(int i=0; i<r; i++){
        	c = board[i].length;
			for(int j=0; j<c; j++){
				int[] a = {-1, 0, 1};
				int[] b = {-1, 0, 1};
				int result = 0;
				for(int m=0; m<3; m++){
					for(int n=0; n<3; n++){
						if(m!=1 || n!=1){
							try{
								if(board[i+a[m]][j+b[n]] == 1 || board[i+a[m]][j+b[n]] == 3)
									result += 1;
							}catch(Exception e){	
							}
						}	
					}
				}//end for
				if(board[i][j] == 1){
					if(result == 2 || result == 3)
						board[i][j] = 3; //保持活
				}
				else{
					if(result == 3)
						board[i][j] = 2; //由死到活
				}
			}
		} //end for  
        
        for(int i=0; i<r; i++){
        	c = board[i].length;
			for(int j=0; j<c; j++){
				if(board[i][j] == 1)
					board[i][j] = 0;
				else if(board[i][j] == 3)
					board[i][j] = 1;
				else if(board[i][j] == 2)
					board[i][j] = 1;
			}
        }
    }
}